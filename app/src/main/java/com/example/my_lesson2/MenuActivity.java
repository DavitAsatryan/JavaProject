package com.example.my_lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    public  Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        intent = getIntent();

        setContentView(R.layout.activity_menu);

    }

    public void clickNameData(View view) {
        String name = intent.getStringExtra("name");
        intent = new Intent(this, NameActivity.class);
        intent.putExtra("name", name);
        startActivity(intent);
    }

    public void clickFirstNameData(View view) {
        String first = intent.getStringExtra("first");
        intent = new Intent(this, NameActivity.class);
        intent.putExtra("first", first);
        startActivity(intent);
    }
    public void clickPasswordData(View view) {
        String password = intent.getStringExtra("password");
        intent = new Intent(this, NameActivity.class);
        intent.putExtra("password", password);
        startActivity(intent);
    }
    public void clickEmailData(View view) {
        String email = intent.getStringExtra("email");
        intent = new Intent(this, NameActivity.class);
        intent.putExtra("email", email);
        startActivity(intent);
    }
   /* public void clickPhoneData(View view) {
        String phone = intent.getStringExtra("phone");
        intent = new Intent(this, NameActivity.class);
        intent.putExtra("phone", phone);
        startActivity(intent);
    }*/
}