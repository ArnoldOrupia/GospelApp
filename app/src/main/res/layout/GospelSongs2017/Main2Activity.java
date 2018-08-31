package in.thegeekybaniya.GospelSongs2017;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;

public class Main2Activity extends AppCompatActivity {

    RecyclerView rvSongs;

    SongModel[] songs = {new SongModel("Nichukue","Mercy Masika","30mbs","5 minutes"),
            new SongModel("Umenitoa","Size 8",  "20mbs", "4 minutes" ),
            new SongModel("mwamba","Maximum Melodies","45mbs","6 minutes"),
            new SongModel("Bazokizo","Collo","10mbs","3 minutes"),
            new SongModel("Gwata Njara","Karimi Bruno", "25mbs","2 minutes"),
            new SongModel("Mateke","Size 8", "4mbs","4 minutes"),
            new SongModel("Mwema","Mercy Masika","8mbs","3 minutes")};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

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
}
