package com.example.nagesh.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList countries;
    private ArrayList<String> countries1;
    private ArrayList<String> countries2;
    private ArrayList<String> countries3;
    private ArrayList<String> countries4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }
    private void initViews(){
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.card_recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        countries = new ArrayList<>();
        countries.add("Australia");
        countries.add("India");
        countries.add("United States of America");
        countries.add("Germany");
        countries.add("Russia");
        countries.add("Russia");
        countries.add("Russia");
        countries.add("Russia");
        countries.add("Russia");
        countries.add("Russia");
        countries.add("Russia");
        countries1 = new ArrayList<>();
        countries1.add("Australia");
        countries1.add("India");
        countries1.add("United States of America");
        countries1.add("Germany");
        countries1.add("Russia");
        countries1.add("Russia");
        countries1.add("Russia");
        countries1.add("Russia");
        countries1.add("Russia");
        countries1.add("Russia");
        countries1.add("Russia");
        countries2 = new ArrayList<>();
        countries2.add("Australia");
        countries2.add("India");
        countries2.add("United States of America");
        countries2.add("Germany");
        countries2.add("Russia");
        countries2.add("Russia");
        countries2.add("Russia");
        countries2.add("Russia");
        countries2.add("Russia");
        countries2.add("Russia");
        countries2.add("Russia");
        countries3 = new ArrayList<>();
        countries3.add("Australia");
        countries3.add("India");
        countries3.add("United States of America");
        countries3.add("Germany");
        countries3.add("Russia");
        countries3.add("Russia");
        countries3.add("Russia");
        countries3.add("Russia");
        countries3.add("Russia");
        countries3.add("Russia");
        countries3.add("Russia");
        countries4 = new ArrayList<>();
        countries4.add("Australia");
        countries4.add("India");
        countries4.add("United States of America");
        countries4.add("Germany");
        countries4.add("Russia");
        countries4.add("Russia");
        countries4.add("Russia");
        countries4.add("Russia");
        countries4.add("Russia");
        countries4.add("Russia");
        countries4.add("Russia");



        RecyclerView.Adapter adapter = new DataAdapter(countries,countries1,countries2,countries3,countries4);
        recyclerView.setAdapter(adapter);

        recyclerView.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
            GestureDetector gestureDetector = new GestureDetector(getApplicationContext(), new GestureDetector.SimpleOnGestureListener() {

                @Override
                public boolean onSingleTapUp(MotionEvent e) {
                    return true;
                }


            });
            @Override
            public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {

                View child = rv.findChildViewUnder(e.getX(), e.getY());
                if(child != null && gestureDetector.onTouchEvent(e)) {
                    int position = rv.getChildAdapterPosition(child);
                  //  Toast.makeText(getApplicationContext(), countries.get(position), Toast.LENGTH_SHORT).show();
                }

                return false;
            }

            @Override
            public void onTouchEvent(RecyclerView rv, MotionEvent e) {

            }

            @Override
            public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

            }
        });
    }
}

