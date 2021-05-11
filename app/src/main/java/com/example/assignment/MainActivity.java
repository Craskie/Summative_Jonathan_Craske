package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void MuseumPage(View v)
    {
        EditText userName = (EditText) findViewById(R.id.LoginUsername);
        EditText password = (EditText) findViewById(R.id.LoginPassword);

        myDBConnector objDBConnector = new myDBConnector(this, null, null, 1);

        if (objDBConnector.checkLogin(userName.getText().toString(), password.getText().toString()))
        {
            Intent intent = new Intent(this, MuseumsList.class);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(getApplicationContext(),
                    "Unsuccessful login \nIncorrect credentials", Toast.LENGTH_LONG).show();
        }
    }



    // go to registration page
    public void registrationPageFun(View v)
    {
        Intent intent = new Intent(this, Registration.class);
        startActivity(intent);
    }

}