package com.givaudan.movie.presentation.search

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.givaudan.movie.R
import com.givaudan.movie.domain.model.MovieShort
import com.squareup.picasso.Picasso

class SearchAdapter(context: Context) : RecyclerView.Adapter<SearchAdapter.ViewHolder>(){

    private val movies : ArrayList<MovieShort> = ArrayList()

    private val inflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(inflater.inflate(R.layout.item_movie, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(movies.get(position))
    }

    override fun getItemCount() = movies.size

    fun setData(movies: List<MovieShort>?) {
        this.movies.clear()

        movies?.let{
            this.movies.addAll(movies)
        }

    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val title : TextView = view.findViewById(R.id.title)
        private val poster : ImageView = view.findViewById(R.id.poster)

        init {
            view.setOnClickListener{
                //TODO vers details
            }
        }

        fun bind(movieShort: MovieShort) {
            title.text = movieShort.title
            if(movieShort.poster.isNotBlank() && movieShort.poster.isNotEmpty()){
                Picasso.get().load(movieShort.poster).into(poster)
            } else {
                poster.setImageDrawable(null)
            }

        }

    }

}