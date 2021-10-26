package com.example.ycm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class menu extends AppCompatActivity {

    ImageButton button, pizza_menu_btn, cakes_menu_btn, cart_btn,burger_menu_btn,donut_menu_btn,seachbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        button = findViewById(R.id.settingbtn);
        pizza_menu_btn = findViewById(R.id.pizzamenu_btn);
        cakes_menu_btn = findViewById(R.id.cakes_menu_btn);
        cart_btn = findViewById(R.id.cart_btn);
        burger_menu_btn = findViewById(R.id.burger_menu_btn);
        donut_menu_btn = findViewById(R.id.donut_menu_btn);
        seachbtn = findViewById(R.id.searchbtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menu.this, settings.class);
                startActivity(intent);
            }
        });

        seachbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menu.this, search.class);
                startActivity(intent);
            }
        });


        pizza_menu_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menu.this, pizza_menu.class);
                startActivity(intent);
            }
        });

        cakes_menu_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menu.this, cakesmenu.class);
                startActivity(intent);
            }
        });
        cart_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(menu.this, cart.class);
                startActivity(intent);

            }
        });

        burger_menu_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menu.this, Burger_menu.class);
                startActivity(intent);
            }
        });
        donut_menu_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menu.this, Donut_menu.class);
                startActivity(intent);
            }
        });

    }
}