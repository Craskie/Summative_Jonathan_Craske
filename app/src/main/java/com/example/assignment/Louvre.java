package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Louvre extends AppCompatActivity {


    public static ticket LouvreTicket;
    EditText ticketQTY;
    RadioButton radioButton;
    RadioGroup timeSlot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_louvre);

        ticketQTY = findViewById(R.id.LouvreQTY);

        timeSlot = findViewById(R.id.LovreTimeSlots);

        LouvreTicket = new ticket();
        LouvreTicket.museum = "Louvre";

    }

    // go to museum page
    public void MuseumListFun(View v)
    {
        Intent intent = new Intent(this, MuseumsList.class);
        startActivity(intent);
    }

    // go to shop
    public void ShopFun(View v)
    {
        Intent intent = new Intent(this, Shop.class);
        startActivity(intent);
    }

    // add ticket to basket
    public void TicketFun(View v)
    {
        LouvreTicket.qty = Integer.parseInt(String.valueOf(ticketQTY.getText()));
        LouvreTicket.total = 10 * LouvreTicket.qty;

        System.out.println("Museum: " + LouvreTicket.museum);
        System.out.println("Ticket time slot: " + LouvreTicket.TimeSlot);
        System.out.println("Ticket quantity: " + LouvreTicket.qty);
        System.out.println("Ticket cost: " + LouvreTicket.total);

    }

    public void checkButton(View v)
    {
        int radioId = timeSlot.getCheckedRadioButtonId();

        radioButton = findViewById(radioId);
        //objTicket.timeSlot = (String) radioButton.getText();


        LouvreTicket.TimeSlot = (String) radioButton.getText();

        System.out.println("Ticket time slot: " + LouvreTicket.TimeSlot);
    }

}