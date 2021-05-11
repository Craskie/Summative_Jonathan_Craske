package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.BreakIterator;

public class Shop extends AppCompatActivity {

    public static order itemOrder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
        EditText shirtqty = findViewById(R.id.shirtQTY);
        Button addShirtBttn = findViewById(R.id.shirtBuy);


        item shirt = new item("Shirt", 10);

        itemOrder = new order();

        itemOrder.basket.add(shirt);

        addShirtBttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itemOrder.basket.get(0).qty = Integer.parseInt(String.valueOf(shirtqty.getText()));
            }
        });

    }



    // function to go to cafe
    public void CafeFun(View v)
    {
        Intent intent = new Intent(this, Cafe.class);
        startActivity(intent);
    }
    // function to go back to museum list
    public void MuseumFun(View v)
    {
        Intent intent = new Intent(this, MuseumsList.class);
        startActivity(intent);
    }



}