package com.example.arnoh.gospelapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvSongs;
    String url1="http://sv70.onlinevideoconverter.com/download?file=f5g6d3f5f5c2a0c2";
    String url2="http://sv70.onlinevideoconverter.com/download?file=f5g6d3f5f5c2a0c2";
    String url3="http://sv70.onlinevideoconverter.com/download?file=f5g6d3f5f5c2a0c2";
    String url4="http://s11.onlinevideoconverter.com/download?file=i8f5d3a0g6j9e4";
    String url5="http://s11.onlinevideoconverter.com/download?file=i8f5d3a0g6j9e4";
    String url6="http://s11.onlinevideoconverter.com/download?file=i8f5d3a0g6j9e4";
    String url7="http://s11.onlinevideoconverter.com/download?file=i8f5d3a0g6j9e4";








    SongModel[] songs = {new SongModel("Msaidizi","Gloria Muliro","6Mbs","4:50", R.drawable.gloria,url1),
            new SongModel("Shule yako","Mercy Masika",  "6Mbs", "3:22",  R.drawable.masika,url2 ),
            new SongModel("Mateke","Size 8","5Mbs","4:04", R.drawable.size8, url3),
            new SongModel("Usiku na mchana","Kambua","4Mbs","4:05", R.drawable.kambua,url4),
            new SongModel("Vanity","Dady Owen", "3Mbs","4:29", R.drawable.owen,url5),
            new SongModel("Mama","Bahati", "4Mbs","3:52", R.drawable.bahati, url6),
            new SongModel("Vigelegele","willy Paul","5Mbs","3:23", R.drawable.willy,url7)
    };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvSongs = (RecyclerView) findViewById(R.id.rvSongs);

        rvSongs.setHasFixedSize(true);
        rvSongs.setLayoutManager(new LinearLayoutManager(this));
        rvSongs.setAdapter(new SongsAdapter(songs,this));
        rvSongs.setItemAnimator(new DefaultItemAnimator());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       int  id= item.getItemId();
        if (id==R.id.action_search){

        }
        else if (id== R.id.action_download){

            Intent i = new Intent(this, Download.class);
            startActivity(i);
            ProgressBar bar = new ProgressBar(this);

        }
        return super.onOptionsItemSelected(item);
    }
}
