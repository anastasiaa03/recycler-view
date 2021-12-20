package com.example.recyclerviewexample;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Model> movies = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setData();

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, movies);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL, true));
    }

    private void setData(){
        movies.add(new Model(R.drawable.chel, "Spider-Man: No Way Home"));
        movies.add(new Model(R.drawable.soho, "Last Night in Soho"));
        movies.add(new Model(R.drawable.matr, "Матрица: Воскрешение"));
        movies.add(new Model(R.drawable.gg, "Главный герой"));
    }
}