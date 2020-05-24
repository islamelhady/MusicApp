package com.elhady.musicapp;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Youtube extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_youtube );

        ArrayList<ModelLinks> modelLinks = new ArrayList<>();


        modelLinks.add( new ModelLinks( "Coldplay - Paradise", "https://www.youtube.com/watch?v=1G4isv_Fylg" ) );
        modelLinks.add( new ModelLinks( "Coldplay - Clocks", "https://www.youtube.com/watch?v=d020hcWA_Wg" ) );
        modelLinks.add( new ModelLinks( "Coldplay - Magic", "https://www.youtube.com/watch?v=Qtb11P1FWnc" ) );
        modelLinks.add( new ModelLinks( "Coldplay - Princess Of China ft. Rihanna", "https://www.youtube.com/watch?v=1Uw6ZkbsAH8" ) );
        modelLinks.add( new ModelLinks( "Imagine Dragons - Next To Me", "https://www.youtube.com/watch?v=-C_rvt0SwLE" ) );
        modelLinks.add( new ModelLinks( "Imagine Dragons - Gold", "https://www.youtube.com/watch?v=Rl3ELiPXFRo" ) );
        modelLinks.add( new ModelLinks( "Bebe Rexha - Small Doses", "www.youtube.com/watch?v=hkafKITOlVA" ) );
        modelLinks.add( new ModelLinks( "Charli XCX - 5 In The Morning", "www.youtube.com/watch?v=4qyUb4OU_P8" ) );
        modelLinks.add( new ModelLinks( "Dardan - Krone", "www.youtube.com/watch?v=Ih_FvdBb6bs" ) );
        modelLinks.add( new ModelLinks( "Queen - I Wanna Break Free", "www.youtube.com/watch?v=f4Mc-NYPHaQ" ) );
        modelLinks.add( new ModelLinks( "Queen - Crazy Little Thing Called Love", "www.youtube.com/watch?v=zO6D_BAuYCI" ) );
        modelLinks.add( new ModelLinks( "Queen - Killer Queen", "https://www.youtube.com/watch?v=2ZBtPf7FOoM" ) );
        modelLinks.add( new ModelLinks( "Queen - Under Pressure", "https://www.youtube.com/watch?v=a01QQZyl-_I" ) );
        modelLinks.add( new ModelLinks( "Queen - Don't Stop Me Now", "https://www.youtube.com/watch?v=HgzGwKwLmgM" ) );
        modelLinks.add( new ModelLinks( "Coldplay - Viva La Vida", "https://www.youtube.com/watch?v=dvgZkm1xWPE" ) );
        modelLinks.add( new ModelLinks( "Miike Snow - Genghis Khan", "https://www.youtube.com/watch?v=P_SlAzsXa7E" ) );
        modelLinks.add( new ModelLinks( "Cher Lloyd - None Of My Business", "https://www.youtube.com/watch?v=IMeFI0eVk2w" ) );
        modelLinks.add( new ModelLinks( "DNCE - Cake By The Ocean", "https://www.youtube.com/watch?v=vWaRiD5ym74" ) );
        modelLinks.add( new ModelLinks( "R.E.M. - Losing My Religion", "https://www.youtube.com/watch?v=xwtdhWltSIg" ) );
        modelLinks.add( new ModelLinks( "Yusuf (Cat Stevens) - Dont Let Me Be Misunderstood", "https://www.youtube.com/watch?v=LX2e_yl8m9g" ) );

        recyclerView = findViewById( R.id.recycleView_youtube);
        recyclerView.setHasFixedSize( true );
        layoutManager = new LinearLayoutManager( this );
        adapter = new YoutubeAdapter(modelLinks);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}