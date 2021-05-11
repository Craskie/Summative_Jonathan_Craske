package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class American extends AppCompatActivity {

    ticket AmericanTicket;
    EditText ticketQTY;
    RadioButton radioButton;
    RadioGroup timeSlot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_american);

        ticketQTY = findViewById(R.id.AmericanQTY);

        timeSlot = findViewById(R.id.AmericanTimeSlots);

        AmericanTicket = new ticket();
        AmericanTicket.museum = "American Museum of Natural History";

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
        AmericanTicket.qty = Integer.parseInt(String.valueOf(ticketQTY.getText()));
        AmericanTicket.total = 10 * AmericanTicket.qty;

        System.out.println("Museum: " + AmericanTicket.museum);
        System.out.println("Ticket time slot: " + AmericanTicket.TimeSlot);
        System.out.println("Ticket quantity: " + AmericanTicket.qty);
        System.out.println("Ticket cost: " + AmericanTicket.total);

    }

    public void checkButton(View v)
    {
        int radioId = timeSlot.getCheckedRadioButtonId();

        radioButton = findViewById(radioId);
        //objTicket.timeSlot = (String) radioButton.getText();


        AmericanTicket.TimeSlot = (String) radioButton.getText();

        System.out.println("Ticket time slot: " + AmericanTicket.TimeSlot);
    }

}