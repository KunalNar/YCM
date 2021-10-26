package com.example.ycm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.inputmethod.EditorInfo;
import android.widget.SearchView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class search extends AppCompatActivity {

    private ExampleAdapter adapter;
    private List<ExampleItem> exampleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        fillExampleList();
        setUpRecyclerView();
    }

    private void fillExampleList() {
        exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.cake, "Cheese Cakes", "700 RS"));
        exampleList.add(new ExampleItem(R.drawable.cake, "Black Forest cake", "350 RS"));
        exampleList.add(new ExampleItem(R.drawable.cake, "PineApple Cakes", "350 RS"));
        exampleList.add(new ExampleItem(R.drawable.cake, "Dutch Cakes", "500 RS"));
        exampleList.add(new ExampleItem(R.drawable.cake, "Rasmali Cakes", "350 RS"));
        exampleList.add(new ExampleItem(R.drawable.cake, "Fresh Fruit Exotica Cakes", "350 RS"));

        exampleList.add(new ExampleItem(R.drawable.burger, "Veg Burger", "100 RS + 90 RS for combo"));
        exampleList.add(new ExampleItem(R.drawable.burger, "Paneer Burger", "120 RS + 90 RS for combo"));
        exampleList.add(new ExampleItem(R.drawable.burger, "Chicken Burger", "150 RS + 90 RS for combo"));
        exampleList.add(new ExampleItem(R.drawable.burger, "Veg Sub Sandwhich", "100 RS + 90 RS for combo"));
        exampleList.add(new ExampleItem(R.drawable.burger, "Veg Pasta", "250 RS"));
        exampleList.add(new ExampleItem(R.drawable.burger, "Chicken Pasta", "250 RS"));

        exampleList.add(new ExampleItem(R.drawable.pizaa, "Margherita Pizza", "Small/Medium/Large"));
        exampleList.add(new ExampleItem(R.drawable.pizaa, "Veggie Pizza", "Small/Medium/Large"));
        exampleList.add(new ExampleItem(R.drawable.pizaa, "Italian Veg Pizza", "Small/Medium/Large"));
        exampleList.add(new ExampleItem(R.drawable.pizaa, "Sweat and Spicy Pizza", "Small/Medium/Large"));
        exampleList.add(new ExampleItem(R.drawable.pizaa, "Pepperoni Pizza", "Small/Medium/Large"));
        exampleList.add(new ExampleItem(R.drawable.pizaa, "Chicken Pizza", "Small/Medium/Large"));

        exampleList.add(new ExampleItem(R.drawable.donut, "Donuts", "65 RS"));
        exampleList.add(new ExampleItem(R.drawable.donut, "Brownies", "80 RS"));
        exampleList.add(new ExampleItem(R.drawable.donut, "Donuts", "100 RS"));
        exampleList.add(new ExampleItem(R.drawable.donut, "Tiramisu", "50 RS"));
        exampleList.add(new ExampleItem(R.drawable.donut, "CupCakes", "250 RS"));
        exampleList.add(new ExampleItem(R.drawable.donut, "Cheese Cake Pastry", "100 RS"));

    }
        private void setUpRecyclerView() {
            RecyclerView recyclerView = findViewById(R.id.recycler_view);
            recyclerView.setHasFixedSize(true);
            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
            adapter = new ExampleAdapter(exampleList);

            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setAdapter(adapter);
        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.example_menu, menu);

            MenuItem searchItem = menu.findItem(R.id.action_search);
            SearchView searchView = (SearchView) searchItem.getActionView();

            searchView.setImeOptions(EditorInfo.IME_ACTION_DONE);

            searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                @Override
                public boolean onQueryTextSubmit(String query) {
                    return false;
                }

                @Override
                public boolean onQueryTextChange(String newText) {
                    adapter.getFilter().filter(newText);
                    return false;
                }
            });
            return true;
        }
    }