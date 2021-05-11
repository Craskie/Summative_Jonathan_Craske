package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Vatican extends AppCompatActivity {

    ticket VaticanTicket;
    EditText ticketQTY;
    RadioButton radioButton;
    RadioGroup timeSlot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vatican);

        ticketQTY = findViewById(R.id.VaticanQTY);

        timeSlot = findViewById(R.id.VaticanTimeSlots);

        VaticanTicket = new ticket();
        VaticanTicket.museum = "Louvre";

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
        VaticanTicket.qty = Integer.parseInt(String.valueOf(ticketQTY.getText()));
        VaticanTicket.total = 10 * VaticanTicket.qty;

        System.out.println("Museum: " + VaticanTicket.museum);
        System.out.println("Ticket time slot: " + VaticanTicket.TimeSlot);
        System.out.println("Ticket quantity: " + VaticanTicket.qty);
        System.out.println("Ticket cost: " + VaticanTicket.total);

    }

    public void checkButton(View v)
    {
        int radioId = timeSlot.getCheckedRadioButtonId();

        radioButton = findViewById(radioId);
        //objTicket.timeSlot = (String) radioButton.getText();


        VaticanTicket.TimeSlot = (String) radioButton.getText();

        System.out.println("Ticket time slot: " + VaticanTicket.TimeSlot);
    }

}