package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class NatGallery extends AppCompatActivity {

    ticket NatGalleryTicket;
    EditText ticketQTY;
    RadioButton radioButton;
    RadioGroup timeSlot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nat_gallery);

        ticketQTY = findViewById(R.id.NatGalleryQTY);

        timeSlot = findViewById(R.id.NatGalleryTimeSlots);

        NatGalleryTicket = new ticket();
        NatGalleryTicket.museum = "National Gallery";

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
        NatGalleryTicket.qty = Integer.parseInt(String.valueOf(ticketQTY.getText()));
        NatGalleryTicket.total = 10 * NatGalleryTicket.qty;

        System.out.println("Museum: " + NatGalleryTicket.museum);
        System.out.println("Ticket time slot: " + NatGalleryTicket.TimeSlot);
        System.out.println("Ticket quantity: " + NatGalleryTicket.qty);
        System.out.println("Ticket cost: " + NatGalleryTicket.total);

    }

    public void checkButton(View v)
    {
        int radioId = timeSlot.getCheckedRadioButtonId();

        radioButton = findViewById(radioId);
        //objTicket.timeSlot = (String) radioButton.getText();


        NatGalleryTicket.TimeSlot = (String) radioButton.getText();

        System.out.println("Ticket time slot: " + NatGalleryTicket.TimeSlot);
    }

}