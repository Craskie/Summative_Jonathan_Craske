package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MuseumsList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museums_list);
    }


    // go to louvre page
    public void LouvreFun(View v)
    {
        Intent intent = new Intent(this, Louvre.class);
        startActivity(intent);
    }

    // go to museum of china page
    public void ChinaFun(View v)
    {
        Intent intent = new Intent(this, China.class);
        startActivity(intent);
    }

    // go to vatican museum page
    public void VaticanFun(View v)
    {
        Intent intent = new Intent(this, Vatican.class);
        startActivity(intent);
    }

    // go to Metropolitan Museum of Art page
    public void MetArtFun(View v)
    {
        Intent intent = new Intent(this, MetArt.class);
        startActivity(intent);
    }

    // go to british museum page
    public void BritishFun(View v)
    {
        Intent intent = new Intent(this, British.class);
        startActivity(intent);
    }

    // go to national gallery page
    public void NatGalleryFun(View v)
    {
        Intent intent = new Intent(this, NatGallery.class);
        startActivity(intent);
    }

    // go to American Museum of Natural History  page
    public void AmericanFun(View v)
    {
        Intent intent = new Intent(this, American.class);
        startActivity(intent);
    }

    // go to tate modern page
    public void TateFun(View v)
    {
        Intent intent = new Intent(this, Tate.class);
        startActivity(intent);
    }

    // go to natural history museum page
    public void NaturalHistoryFun(View v)
    {
        Intent intent = new Intent(this, NaturalHistory.class);
        startActivity(intent);
    }

    // go to State Hermitage Museum page
    public void StateFun(View v)
    {
        Intent intent = new Intent(this, State.class);
        startActivity(intent);
    }

}