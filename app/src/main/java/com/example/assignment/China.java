package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class China extends AppCompatActivity {

    ticket ChinaTicket;
    EditText ticketQTY;
    RadioButton radioButton;
    RadioGroup timeSlot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_china);

        ticketQTY = findViewById(R.id.chinaQTY);

        timeSlot = findViewById(R.id.ChinaTimeSlots);

        ChinaTicket = new ticket();
        ChinaTicket.museum = "National Museum of China";

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
        ChinaTicket.qty = Integer.parseInt(String.valueOf(ticketQTY.getText()));
        ChinaTicket.total = 10 * ChinaTicket.qty;

        System.out.println("Museum: " + ChinaTicket.museum);
        System.out.println("Ticket time slot: " + ChinaTicket.TimeSlot);
        System.out.println("Ticket quantity: " + ChinaTicket.qty);
        System.out.println("Ticket cost: " + ChinaTicket.total);

    }

    public void checkButton(View v)
    {
        int radioId = timeSlot.getCheckedRadioButtonId();

        radioButton = findViewById(radioId);
        //objTicket.timeSlot = (String) radioButton.getText();


        ChinaTicket.TimeSlot = (String) radioButton.getText();

        System.out.println("Ticket time slot: " + ChinaTicket.TimeSlot);
    }

}