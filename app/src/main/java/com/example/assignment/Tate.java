package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Tate extends AppCompatActivity {

    ticket TateTicket;
    EditText ticketQTY;
    RadioButton radioButton;
    RadioGroup timeSlot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tate);

        ticketQTY = findViewById(R.id.TateQTY);

        timeSlot = findViewById(R.id.TateTimeSlots);

        TateTicket = new ticket();
        TateTicket.museum = "Tate Modern";

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
        TateTicket.qty = Integer.parseInt(String.valueOf(ticketQTY.getText()));
        TateTicket.total = 10 * TateTicket.qty;

        System.out.println("Museum: " + TateTicket.museum);
        System.out.println("Ticket time slot: " + TateTicket.TimeSlot);
        System.out.println("Ticket quantity: " + TateTicket.qty);
        System.out.println("Ticket cost: " + TateTicket.total);

    }

    public void checkButton(View v)
    {
        int radioId = timeSlot.getCheckedRadioButtonId();

        radioButton = findViewById(radioId);
        //objTicket.timeSlot = (String) radioButton.getText();


        TateTicket.TimeSlot = (String) radioButton.getText();

        System.out.println("Ticket time slot: " + TateTicket.TimeSlot);
    }
}