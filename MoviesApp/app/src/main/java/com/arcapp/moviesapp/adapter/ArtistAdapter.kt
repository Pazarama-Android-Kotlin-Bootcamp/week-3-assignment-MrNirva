package com.arcapp.moviesapp.fragment

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.arcapp.moviesapp.R
import com.arcapp.moviesapp.data.ArtistModel
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView

class ArtistAdapter(
    private val context:Context,
    private val artistList: MutableList<ArtistModel>,
    ) :
    RecyclerView.Adapter<ArtistAdapter.ArtistsViewHolder>() {

    // connect the design
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtistsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_artist_list, parent, false)
        return ArtistsViewHolder(view)
    }

    // connect the objects on the design
    override fun onBindViewHolder(holder: ArtistsViewHolder, position: Int) {
        holder.bind(context, artistList[position])
    }

    class ArtistsViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val ivArtistImage = view.findViewById<CircleImageView>(R.id.ivArtistImage)
        private val tvArtistName = view.findViewById<TextView>(R.id.tvArtistName)

        fun bind(context: Context, artist: ArtistModel) {

            // add data
            tvArtistName.text = artist.name

            // load image with glide library
            Glide.with(context)
                .load(artist.image)
                .centerCrop()
                .into(ivArtistImage)

        }

    }

    // for adapter set all item size
    override fun getItemCount(): Int {
        return artistList.size
    }

}