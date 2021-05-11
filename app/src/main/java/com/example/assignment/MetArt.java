package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MetArt extends AppCompatActivity {

    ticket MetArtTicket;
    EditText ticketQTY;
    RadioButton radioButton;
    RadioGroup timeSlot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_met_art);

        ticketQTY = findViewById(R.id.MetArtQTY);

        timeSlot = findViewById(R.id.MetArtTimeSlots);

        MetArtTicket = new ticket();
        MetArtTicket.museum = "Metropolitan Museum of Art";

    }


    public void GoBack(View v)
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
        MetArtTicket.qty = Integer.parseInt(String.valueOf(ticketQTY.getText()));
        MetArtTicket.total = 10 * MetArtTicket.qty;

        System.out.println("Museum: " + MetArtTicket.museum);
        System.out.println("Ticket time slot: " + MetArtTicket.TimeSlot);
        System.out.println("Ticket quantity: " + MetArtTicket.qty);
        System.out.println("Ticket cost: " + MetArtTicket.total);

    }

    public void checkButton(View v)
    {
        int radioId = timeSlot.getCheckedRadioButtonId();

        radioButton = findViewById(radioId);
        //objTicket.timeSlot = (String) radioButton.getText();


        MetArtTicket.TimeSlot = (String) radioButton.getText();

        System.out.println("Ticket time slot: " + MetArtTicket.TimeSlot);
    }

}