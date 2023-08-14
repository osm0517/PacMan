package com.example.pacman_v1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ScoreActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ScoreItemAdapter itemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        recyclerView = findViewById(R.id.recyclerView);

        itemAdapter = new ScoreItemAdapter();
        recyclerView.setAdapter(itemAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        itemAdapter.addItem("itemTest");
        itemAdapter.addItem("itemTest");
        itemAdapter.addItem("itemTest");
        itemAdapter.addItem("itemTest");
        itemAdapter.addItem("itemTest");
        itemAdapter.addItem("itemTest");
        itemAdapter.addItem("itemTest");
    }
}