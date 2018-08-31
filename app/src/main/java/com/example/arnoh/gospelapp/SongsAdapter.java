package com.example.arnoh.gospelapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by ARNOH on 1/6/2018.
 */

public class SongsAdapter extends RecyclerView.Adapter<SongsAdapter.ViewHolder> {

    SongModel[] songs;
    Context context;
    //String myurl="https://www.musixmatch.com/lyrics/Mercy-Masika/Shule-Yako-Nifunze";

    public SongsAdapter(SongModel[] songs, MainActivity main2Activity) {
        this.songs = songs;
        context = main2Activity;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.songs_model,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.tvSong.setText(songs[position].getSongs());
        holder.tvMusician.setText(songs[position].getMusician());

        holder.cvSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
                SharedPreferences.Editor editor = preferences.edit();

                editor.putInt("position",position);
                editor.putString("size",songs[position].getSize());
                editor.putString("lenght",songs[position].getLength());
                editor.putInt("image", songs[position].getImage());
                editor.putString("url",songs[position].getUrl());
                editor.apply();
               // Intent intent = new Intent(context,SongDetails.class);
                Intent intent = new Intent(context, SongDetails.class);
                intent.putExtra("url", R.string.url);
                intent.putExtra("image",songs[position].getImage());
                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return songs.length == 0 ? 0 : songs.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView cvSongs;
        TextView tvSong, tvMusician;
        public ViewHolder(View itemView) {
            super(itemView);
            tvSong = (TextView) itemView.findViewById(R.id.tvTitle);
            tvMusician = (TextView) itemView.findViewById(R.id.tvMusician);
            cvSongs = (CardView) itemView.findViewById(R.id.cvSongs);
        }
    }
}
