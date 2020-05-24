package com.elhady.musicapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Music extends AppCompatActivity {
    public static ArrayList<ModelMusic> musicArrayList;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_music );

        musicArrayList = new ArrayList<>();

        musicArrayList.add( new ModelMusic( "Queen - I Wanna Break Free", R.drawable.queen ) );
        musicArrayList.add( new ModelMusic( "Queen - Crazy Little Thing Called Love", R.drawable.queen ) );
        musicArrayList.add( new ModelMusic( "Queen - Killer Queen", R.drawable.queen ) );
        musicArrayList.add( new ModelMusic( "Cold play - Paradise", R.drawable.cold_play ) );
        musicArrayList.add( new ModelMusic( "Cold play - Clocks", R.drawable.cold_play ) );
        musicArrayList.add( new ModelMusic( "Cold play - Magic", R.drawable.cold_play ) );
        musicArrayList.add( new ModelMusic( "Mike Snow - Genghis Khan", R.drawable.miike_snow ) );
        musicArrayList.add( new ModelMusic( "Cher Lloyd - None Of My Business", R.drawable.charli_excx ) );
        musicArrayList.add( new ModelMusic( "DACE - Cake By The Ocean", R.drawable.two_dancers ) );
        musicArrayList.add( new ModelMusic( "R.E.M. - Losing My Religion", R.drawable.rem ) );
        musicArrayList.add( new ModelMusic( "Yuosuf (Cat Stevens) - Dont Let Me Be Misunderstood", R.drawable.yusuf_cat ) );
        musicArrayList.add( new ModelMusic( "Cold play - Princess Of China ft. Rihanna", R.drawable.cold_play ) );
        musicArrayList.add( new ModelMusic( "Imagine Dragons - Next To Me", R.drawable.imagine_gragons ) );
        musicArrayList.add( new ModelMusic( "Bebe Rexha - Small Doses", R.drawable.bebe_rexha ) );
        musicArrayList.add( new ModelMusic( "Charli XCX - 5 In The Morning", R.drawable.charli_excx ) );
        musicArrayList.add( new ModelMusic( "Dardan - Krone", R.drawable.dankrone ) );
        musicArrayList.add( new ModelMusic( "Imagine Dragons - Gold", R.drawable.imagine_gragons ) );
        musicArrayList.add( new ModelMusic( "Queen - Under Pressure", R.drawable.queen ) );
        musicArrayList.add( new ModelMusic( "Queen - Don't Stop Me Now", R.drawable.queen ) );
        musicArrayList.add( new ModelMusic( "Cold play - Viva La Vida", R.drawable.cold_play ) );

        recyclerView = findViewById( R.id.recyclerView );
        recyclerView.setHasFixedSize( true );
        layoutManager = new LinearLayoutManager( this );
        adapter = new MusicAdapter(musicArrayList, this );
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}

