package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class basket extends AppCompatActivity
{
    int moneyPaid;
    int total;
    Random rand;
    int minNum = 100000;
    int maxNum = 999999;
    double confirmationCode;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basket);


        TextView checkoutTXT = findViewById(R.id.checkoutTXT);
        EditText inputAmount = findViewById(R.id.inputAmount);
        Button payButton = findViewById(R.id.payButton);
        TextView confirmationTXT = findViewById(R.id.confirmationCodeTXT);

        System.out.println("NAME: " + Shop.itemOrder.basket.get(0).name);
        System.out.println("QTY: " + Shop.itemOrder.basket.get(0).qty);


        checkoutTXT.setText("Museum name: " + Louvre.LouvreTicket.museum +
                "\nTime Slot: " + Louvre.LouvreTicket.TimeSlot +
                "\nAmount of ticket(s): " + Louvre.LouvreTicket.qty);

        total = 0;

        for(int i=0; i < Shop.itemOrder.basket.size(); i++)
        {

            if(Shop.itemOrder.basket.get(i).qty > 0)
            {

                total += (Shop.itemOrder.basket.get(i).cost * Shop.itemOrder.basket.get(i).qty);

                checkoutTXT.append("\n\n Item Name: " + Shop.itemOrder.basket.get(i).name + "       " + "Quantity: " + Shop.itemOrder.basket.get(i).qty );

            }
        }

        total += (Louvre.LouvreTicket.total);

        checkoutTXT.append("\n\n Total: £" + total);



        rand = new Random();
        confirmationCode = Math.floor(Math.random()*(maxNum-minNum+1)+minNum);

        payButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {


                moneyPaid = Integer.parseInt(String.valueOf(inputAmount.getText()));

                if(moneyPaid >= total)
                {
                    confirmationTXT.setText("Total paid: " + total +"\n Confirmation code: " + confirmationCode);

                }

            }
        });

    }
}