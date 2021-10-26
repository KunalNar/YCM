package com.example.ycm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;

public class cart extends AppCompatActivity {

    TextView total_text;
    ImageButton back_btn,checkout_btn;
    Integer total;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager mlayoutManager;
    RecyclerView.Adapter mAdapter;


    FirebaseDatabase rootnode;
    DatabaseReference reference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        GlobalVariable globalVariable =(GlobalVariable) getApplicationContext();


        total_text = findViewById(R.id.total_text);
        back_btn = findViewById(R.id.back_btn2);
        checkout_btn = findViewById(R.id.checkout_btn);



        ArrayAdapter List = new ArrayAdapter<String>(this,R.layout.activity_listview,globalVariable.getOrder_list());

        ListView listView = findViewById(R.id.window_list);
        listView.setAdapter(List);


        total = globalVariable.getTotal()+globalVariable.getCake_total()+globalVariable.getBurger_total()+globalVariable.getDonut_total();


        total_text.setText(total.toString()+" Rs");

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(cart.this, menu.class);
                startActivity(intent);
            }
        });

        checkout_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(cart.this, checkout_page.class);
                startActivity(intent);

                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference dbRef = database.getReference();

                dbRef = database.getReference();
                    dbRef.child("order").child("order1").setValue("hrhr");



            }
        });


    }
}