package com.example.ycm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;


public class pizza_menu extends AppCompatActivity {

    TextView pizza_price_textview_1,pizza_price_textview_2,pizza_price_textview_3,pizza_price_textview_4,pizza_price_textview_5,pizza_price_textview_6;
    String string_size_1,string_type_1,order_1, string_size_2,string_type_2,order_2,string_size_3,string_type_3,order_3, string_size_4,string_type_4,order_4,string_size_5,string_type_5,order_5,string_size_6,string_type_6,order_6;

    Integer total, int_pizza_price_1=0,int_pizza_price_2=0,int_pizza_price_3=0,int_pizza_price_4=0,int_pizza_price_5=0,int_pizza_price_6=0;

    ImageButton add_btn_1, small_btn_1, medium_btn_1,large_btn_1, back_btn, cart_btn, add_btn_2, small_btn_2, medium_btn_2,large_btn_2,add_btn_3, small_btn_3, medium_btn_3,large_btn_3, add_btn_4, small_btn_4, medium_btn_4,large_btn_4,add_btn_5, small_btn_5, medium_btn_5,large_btn_5,add_btn_6, small_btn_6, medium_btn_6,large_btn_6;



    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_menu);

        GlobalVariable globalVariable =(GlobalVariable) this.getApplicationContext();

        add_btn_1 = findViewById(R.id.add_btn_1);
        small_btn_1 = findViewById(R.id.small_btn_1);
        medium_btn_1 = findViewById(R.id.medium_btn_1);
        large_btn_1 = findViewById(R.id.large_btn_1);
        back_btn = findViewById(R.id.back_btn);
        cart_btn = findViewById(R.id.cart_btn);
        pizza_price_textview_1 = findViewById(R.id.pizza_price_textview_1);

        small_btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string_size_1 = "small";
                int_pizza_price_1 = 310;
                pizza_price_textview_1.setText(int_pizza_price_1+ " Rs");
            }
        });
        medium_btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string_size_1 = "medium";
                int_pizza_price_1 = 540;
                pizza_price_textview_1.setText(int_pizza_price_1+ " Rs");
            }
        });
        large_btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string_size_1 = "large";
                int_pizza_price_1 = 640;
                pizza_price_textview_1.setText(int_pizza_price_1+ " Rs");
            }
        });
        add_btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string_type_1 = ("Margherita Pizza");
                order_1 = (string_type_1+" - "+string_size_1+" - "+int_pizza_price_1.toString());
                globalVariable.getOrder_list().add(order_1);
            }
        });

        add_btn_2 = findViewById(R.id.add_btn_2);
        small_btn_2 = findViewById(R.id.small_btn_2);
        medium_btn_2 = findViewById(R.id.medium_btn_2);
        large_btn_2 = findViewById(R.id.large_btn_2);
        pizza_price_textview_2 = findViewById(R.id.pizza_price_textview_2);



        small_btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string_size_2 = "small";
                int_pizza_price_2 = 310;
                pizza_price_textview_2.setText(int_pizza_price_2+ " Rs");
            }
        });
        medium_btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string_size_2 = "medium";
                int_pizza_price_2 = 540;
                pizza_price_textview_2.setText(int_pizza_price_2+ " Rs");
            }
        });
        large_btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string_size_2 = "large";
                int_pizza_price_2 = 640;
                pizza_price_textview_2.setText(int_pizza_price_2+ " Rs");
            }
        });
        add_btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string_type_2= ("Veggie Pizza");
                order_2 = (string_type_2+" - "+string_size_2+" - "+int_pizza_price_2.toString());
                globalVariable.getOrder_list().add(order_2);
            }
        });

        add_btn_3 = findViewById(R.id.add_btn_3);
        small_btn_3 = findViewById(R.id.small_btn_3);
        medium_btn_3 = findViewById(R.id.medium_btn_3);
        large_btn_3 = findViewById(R.id.large_btn_3);
        pizza_price_textview_3 = findViewById(R.id.pizza_price_textview_3);


        small_btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string_size_3 = "small";
                int_pizza_price_3 = 410;
                pizza_price_textview_3.setText(int_pizza_price_3+ " Rs");
            }
        });
        medium_btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string_size_3 = "medium";
                int_pizza_price_3 = 590;
                pizza_price_textview_3.setText(int_pizza_price_3+ " Rs");
            }
        });
        large_btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string_size_3 = "large";
                int_pizza_price_3 = 650;
                pizza_price_textview_3.setText(int_pizza_price_3+ " Rs");
            }
        });
        add_btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string_type_3= ("Italian Veg Pizza");
                order_3 = (string_type_3+" - "+string_size_3+" - "+int_pizza_price_3.toString());
                globalVariable.getOrder_list().add(order_3);
            }
        });
        add_btn_4 = findViewById(R.id.add_btn_4);
        small_btn_4 = findViewById(R.id.small_btn_4);
        medium_btn_4 = findViewById(R.id.medium_btn_4);
        large_btn_4 = findViewById(R.id.large_btn_4);
        pizza_price_textview_4 = findViewById(R.id.pizza_price_textview_4);


        small_btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string_size_4 = "small";
                int_pizza_price_4 = 410;
                pizza_price_textview_4.setText(int_pizza_price_4+ " Rs");
            }
        });
        medium_btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string_size_4 = "medium";
                int_pizza_price_4 = 590;
                pizza_price_textview_4.setText(int_pizza_price_4+ " Rs");
            }
        });
        large_btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string_size_4 = "large";
                int_pizza_price_4 = 650;
                pizza_price_textview_4.setText(int_pizza_price_4+ " Rs");
            }
        });
        add_btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string_type_4= ("Sweat and Spicy");
                order_4 = (string_type_4+" - "+string_size_4+" - "+int_pizza_price_4.toString());
                globalVariable.getOrder_list().add(order_4);
            }
        });

        add_btn_5 = findViewById(R.id.add_btn_5);
        small_btn_5 = findViewById(R.id.small_btn_5);
        medium_btn_5 = findViewById(R.id.medium_btn_5);
        large_btn_5 = findViewById(R.id.large_btn_5);
        pizza_price_textview_5 = findViewById(R.id.pizza_price_textview_5);


        small_btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string_size_5 = "small";
                int_pizza_price_5 = 410;
                pizza_price_textview_5.setText(int_pizza_price_5+ " Rs");
            }
        });
        medium_btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string_size_5 = "medium";
                int_pizza_price_5 = 590;
                pizza_price_textview_5.setText(int_pizza_price_5+ " Rs");
            }
        });
        large_btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string_size_5 = "large";
                int_pizza_price_5 = 650;
                pizza_price_textview_5.setText(int_pizza_price_5+ " Rs");
            }
        });
        add_btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string_type_5= ("Pepperoni Pizza");
                order_5 = (string_type_5+" - "+string_size_5+" - "+int_pizza_price_5.toString());
                globalVariable.getOrder_list().add(order_5);
            }
        });

        add_btn_6 = findViewById(R.id.add_btn_6);
        small_btn_6 = findViewById(R.id.small_btn_6);
        medium_btn_6 = findViewById(R.id.medium_btn_6);
        large_btn_6 = findViewById(R.id.large_btn_6);
        pizza_price_textview_6 = findViewById(R.id.pizza_price_textview_6);


        small_btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string_size_6 = "small";
                int_pizza_price_6 = 410;
                pizza_price_textview_6.setText(int_pizza_price_6+ " Rs");
            }
        });
        medium_btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string_size_6 = "medium";
                int_pizza_price_6 = 590;
                pizza_price_textview_6.setText(int_pizza_price_6+ " Rs");
            }
        });
        large_btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string_size_6 = "large";
                int_pizza_price_6 = 650;
                pizza_price_textview_6.setText(int_pizza_price_6+ " Rs");
            }
        });
        add_btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string_type_6= ("Chicken Pizza");
                order_6 = (string_type_6+" - "+string_size_6+" - "+int_pizza_price_6.toString());
                globalVariable.getOrder_list().add(order_6);
            }
        });

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pizza_menu.this, menu.class);
                startActivity(intent);
            }
        });

        cart_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total=int_pizza_price_1+int_pizza_price_2+int_pizza_price_3+int_pizza_price_4+int_pizza_price_5+int_pizza_price_6;
                globalVariable.setTotal(total);
                Intent intent = new Intent(pizza_menu.this, cart.class);
                startActivity(intent);

            }
        });
    }
}