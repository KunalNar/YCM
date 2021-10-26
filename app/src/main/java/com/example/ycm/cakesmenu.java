package com.example.ycm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class cakesmenu extends AppCompatActivity {

    String string_size_1,string_type_1,order_1, string_size_2,string_type_2,order_2,string_size_3,string_type_3,order_3, string_size_4,string_type_4,order_4,string_size_5,string_type_5,order_5,string_size_6,string_type_6,order_6;

    Integer total, int_pizza_price_1=0,int_pizza_price_2=0,int_pizza_price_3=0,int_pizza_price_4=0,int_pizza_price_5=0,int_pizza_price_6=0;

    ImageButton add_btn_1, back_btn, cart_btn, add_btn_2, add_btn_3,   add_btn_4,  add_btn_5,  add_btn_6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cakesmenu);
        GlobalVariable globalVariable =(GlobalVariable) this.getApplicationContext();

        add_btn_1 = findViewById(R.id.add_btn_1);
        back_btn = findViewById(R.id.back_btn);
        cart_btn = findViewById(R.id.cart_btn);

        add_btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string_size_1 = "1/2 kg";
                string_type_1 = ("Blue Berry Cheese Cake");
                int_pizza_price_1 = 700;
                order_1 = (string_type_1+" - "+string_size_1+" - "+int_pizza_price_1.toString());
                globalVariable.getOrder_list().add(order_1);
            }
        });

        add_btn_2 = findViewById(R.id.add_btn_2);

        add_btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string_size_2 = "1/2 kg";
                string_type_2 = ("Black Forest Cake");
                int_pizza_price_2 = 350;
                order_2 = (string_type_2+" - "+string_size_2+" - "+int_pizza_price_2.toString());
                globalVariable.getOrder_list().add(order_2);
            }
        });



        add_btn_3 = findViewById(R.id.add_btn_3);

        add_btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string_size_3 = "1/2 kg";
                string_type_3 = ("Pineapple Cake");
                int_pizza_price_3 = 350;
                order_3 = (string_type_3+" - "+string_size_3+" - "+int_pizza_price_3.toString());
                globalVariable.getOrder_list().add(order_3);
            }
        });
        add_btn_4 = findViewById(R.id.add_btn_4);

        add_btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string_size_4 = "1/2 kg";
                string_type_4 = ("Dutch Truffle Cake");
                int_pizza_price_4 = 500;
                order_4 = (string_type_4+" - "+string_size_4+" - "+int_pizza_price_4.toString());
                globalVariable.getOrder_list().add(order_4);
            }
        });

        add_btn_5 = findViewById(R.id.add_btn_5);

        add_btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string_size_5 = "1/2 kg";
                string_type_5 = ("Rasmali Cake");
                int_pizza_price_5 = 600;
                order_5 = (string_type_5+" - "+string_size_5+" - "+int_pizza_price_5.toString());
                globalVariable.getOrder_list().add(order_5);
            }
        });

        add_btn_6 = findViewById(R.id.add_btn_6);

        add_btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string_size_6 = "1/2 kg";
                string_type_6 = ("Fresh Fruit Exotica Cake");
                int_pizza_price_6 = 600;
                order_6 = (string_type_6+" - "+string_size_6+" - "+int_pizza_price_6.toString());
                globalVariable.getOrder_list().add(order_6);
            }
        });

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(cakesmenu.this, menu.class);
                startActivity(intent);
            }
        });

        cart_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total=int_pizza_price_1+int_pizza_price_2+int_pizza_price_3+int_pizza_price_4+int_pizza_price_5+int_pizza_price_6;
                globalVariable.setCake_total(total);
                Intent intent = new Intent(cakesmenu.this, cart.class);
                startActivity(intent);

            }
        });
    }
}