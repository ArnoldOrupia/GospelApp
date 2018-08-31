package com.example.arnoh.gospelapp;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.net.URL;

public class SongDetails extends AppCompatActivity {

    TextView tvleng, tvsize;
    Button download;
    ImageView img;
    SongModel[] song;

    String url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_details);


        tvleng = (TextView) findViewById(R.id.tvlenghth);
        tvsize = (TextView) findViewById(R.id.tvsize);
        img= (ImageView) findViewById(R.id.pic);


        //getIntent().getStringExtra(url);
        String image = getIntent().getStringExtra("image");
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        tvsize.setText(preferences.getString("size","1"));
        tvleng.setText(preferences.getString("lenght","1")+" ");
        img.setImageResource(preferences.getInt("image",1));



        url = preferences.getString("url", "1");
        download=(Button) findViewById(R.id.btDownload);
        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DownloadManager.Request  request = new DownloadManager.Request(Uri.parse(url));
                request.setTitle("Downloading file");
                request.setDescription("your song is now downloading ");
                request.allowScanningByMediaScanner();
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, "gospelApp");

                DownloadManager manager = (DownloadManager) getBaseContext().getSystemService(Context.DOWNLOAD_SERVICE);
                manager.enqueue(request);

                Toast.makeText(SongDetails.this, "download started" , Toast.LENGTH_SHORT).show();

            }
        });
    }
}
