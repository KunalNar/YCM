package com.example.ycm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class checkout_page extends AppCompatActivity {

    TextView name;
    Integer total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout_page);

        name = findViewById(R.id.nametest);
        GlobalVariable globalVariable =(GlobalVariable) getApplicationContext();

        total = globalVariable.getTotal()+globalVariable.getCake_total()+globalVariable.getBurger_total()+globalVariable.getDonut_total();

        name.setText("Pay "+total.toString()+" Rs cash on delivery");


    }
}