package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    // method for adding a new user
    public void addNewUserFun (View view)
    {
        myDBConnector dbHandler = new myDBConnector(this, null, null, 1);

        // establish binding with components in GUI, name, username and password
        EditText name = (EditText) findViewById(R.id.txtName);
        EditText userName = (EditText) findViewById(R.id.RegisterUsername);
        EditText password = (EditText) findViewById(R.id.RegisterPass);

        // add new user with name, username and password
        dbHandler.addNewUser(name.getText().toString(),
                            userName.getText().toString(),
                            password.getText().toString() );

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }





}