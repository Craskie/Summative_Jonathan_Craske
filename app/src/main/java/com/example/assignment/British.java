package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class British extends AppCompatActivity {

    ticket BritishTicket;
    EditText ticketQTY;
    RadioButton radioButton;
    RadioGroup timeSlot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_british);

        ticketQTY = findViewById(R.id.BritishQTY);

        timeSlot = findViewById(R.id.BritishTimeSlots);

        BritishTicket = new ticket();
        BritishTicket.museum = "British Museum";

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

    public void TicketFun(View v)
    {
        BritishTicket.qty = Integer.parseInt(String.valueOf(ticketQTY.getText()));
        BritishTicket.total = 10 * BritishTicket.qty;

        System.out.println("Museum: " + BritishTicket.museum);
        System.out.println("Ticket time slot: " + BritishTicket.TimeSlot);
        System.out.println("Ticket quantity: " + BritishTicket.qty);
        System.out.println("Ticket cost: " + BritishTicket.total);

    }

    public void checkButton(View v)
    {
        int radioId = timeSlot.getCheckedRadioButtonId();

        radioButton = findViewById(radioId);
        //objTicket.timeSlot = (String) radioButton.getText();


        BritishTicket.TimeSlot = (String) radioButton.getText();

        System.out.println("Ticket time slot: " + BritishTicket.TimeSlot);
    }

}