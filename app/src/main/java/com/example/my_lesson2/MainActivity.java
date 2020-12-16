package com.example.my_lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    private static final String TAG = "-------------------------------";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void clickOk(View view) {
        EditText nameid = (EditText) findViewById(R.id.Name);
        EditText first = (EditText) findViewById(R.id.First);
        EditText pass = (EditText) findViewById(R.id.Password);
        EditText email = (EditText) findViewById(R.id.email);
        EditText phone = (EditText) findViewById(R.id.PhoneN);

        String nameData = nameid.getText().toString();
        String firstData = first.getText().toString();
        String passData = pass.getText().toString();
        String emailData = email.getText().toString();
        String phoneData = phone.getText().toString();

        intent = new Intent(this, MenuActivity.class);
        intent.putExtra("name", nameData);
        intent.putExtra("first", firstData);
        intent.putExtra("password", passData);
        intent.putExtra("email", emailData);
        intent.putExtra("phone", phoneData);

        startActivity(intent);


     /*
        EditText first = (EditText) findViewById(R.id.First);
        EditText pass = (EditText) findViewById(R.id.Password);
        EditText email = (EditText) findViewById(R.id.email);
        EditText phone = (EditText) findViewById(R.id.PhoneN);

        int firstData = Integer.parseInt(first.getText().toString());
        int passData = Integer.parseInt(pass.getText().toString());
        int emailData = Integer.parseInt(email.getText().toString());
        int phoneData = Integer.parseInt(phone.getText().toString());*/




    }



}