package com.example.my_lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String first = intent.getStringExtra("first");
        String password = intent.getStringExtra("password");
        String email = intent.getStringExtra("email");
        String phone = intent.getStringExtra("phone");

        setContentView(R.layout.activity_name);
        TextView textName = (TextView) findViewById(R.id.nameText);
        TextView textFirst = (TextView) findViewById(R.id.firstData);
        TextView textPassword= (TextView) findViewById(R.id.passwordText);
        TextView textEmail= (TextView) findViewById(R.id.emailData);
        TextView textPhone= (TextView) findViewById(R.id.phoneData);
        
        textName.setText(name);
        textFirst.setText(first);
        textPassword.setText(password);
        textEmail.setText(email);
        textPhone.setText(phone);
    }
}