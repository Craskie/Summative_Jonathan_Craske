package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Cafe extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe);
        EditText TeaQty = findViewById(R.id.teaQTY);
        Button AddTea = findViewById(R.id.teaBuy);

        item tea = new item("Tea", 1);


        Shop.itemOrder.basket.add(tea);

        System.out.println(Shop.itemOrder.basket.get(0).name);

        AddTea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Shop.itemOrder.basket.get(1).qty = Integer.parseInt(String.valueOf(TeaQty.getText()));
            }
        });
    }




    // function to go back to shop
    public void ShopFun(View v)
    {
        Intent intent = new Intent(this, Shop.class);
        startActivity(intent);
    }
    // function to go to basket
    public void basketFun(View v)
    {
        Intent intent = new Intent(this, basket.class);
        startActivity(intent);
    }

}