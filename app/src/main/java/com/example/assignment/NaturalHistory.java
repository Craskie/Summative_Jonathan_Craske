package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class NaturalHistory extends AppCompatActivity {

    ticket NatHistoryTicket;
    EditText ticketQTY;
    RadioButton radioButton;
    RadioGroup timeSlot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_natural_history);

        ticketQTY = findViewById(R.id.NatHistoryQTY);

        timeSlot = findViewById(R.id.NatHistoryTimeSlots);

        NatHistoryTicket = new ticket();
        NatHistoryTicket.museum = "Natural History Museum";

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
        NatHistoryTicket.qty = Integer.parseInt(String.valueOf(ticketQTY.getText()));
        NatHistoryTicket.total = 10 * NatHistoryTicket.qty;

        System.out.println("Museum: " + NatHistoryTicket.museum);
        System.out.println("Ticket time slot: " + NatHistoryTicket.TimeSlot);
        System.out.println("Ticket quantity: " + NatHistoryTicket.qty);
        System.out.println("Ticket cost: " + NatHistoryTicket.total);

    }

    public void checkButton(View v)
    {
        int radioId = timeSlot.getCheckedRadioButtonId();

        radioButton = findViewById(radioId);
        //objTicket.timeSlot = (String) radioButton.getText();


        NatHistoryTicket.TimeSlot = (String) radioButton.getText();

        System.out.println("Ticket time slot: " + NatHistoryTicket.TimeSlot);
    }

}