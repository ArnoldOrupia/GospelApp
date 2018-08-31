package in.thegeekybaniya.GospelSongs2017;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SongDetails extends AppCompatActivity {

    TextView tvleng, tvsize;
    SongModel[] song;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_details);


        tvleng = (TextView) findViewById(R.id.tvlenghth);
        tvsize = (TextView) findViewById(R.id.tvsize);

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        tvsize.setText(preferences.getString("size","1"));
        tvleng.setText(preferences.getString("lenght","1"));
    }
}
