package com.example.sportsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //Adapter view
    private RecyclerView recyclerView;
    //Data source
    private List<Sport> sportList;
    //Adapter
    private CustomAdapter myAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);
       sportList=new ArrayList<>();

       Sport s1=new Sport("Tennis",R.drawable.tennis);
        Sport s2=new Sport("Baseball",R.drawable.baseball);
        Sport s3=new Sport("Basketball",R.drawable.basketball);
        Sport s4=new Sport("Golf",R.drawable.golf);
        Sport s5=new Sport("Running",R.drawable.runningimg);
        Sport s6=new Sport("Volleyball",R.drawable.volleyball);
        Sport s7=new Sport("Swimming",R.drawable.swimming);
        Sport s8=new Sport("Soccer",R.drawable.soccerimg);

        sportList.add(s1);
        sportList.add(s2);
        sportList.add(s3);
        sportList.add(s4);
        sportList.add(s5);
        sportList.add(s6);
        sportList.add(s7);
        sportList.add(s8);


        myAdapter=new CustomAdapter(sportList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myAdapter);

    }
}