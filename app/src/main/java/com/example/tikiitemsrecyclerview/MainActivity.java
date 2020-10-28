package com.example.tikiitemsrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private final ArrayList<ItemTiki> listItemTiki = new ArrayList<>();
    private RecyclerView mRecyclerView;
    private ListItemsTikiAdapter listItemsTikiAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < 20; i++) {
            listItemTiki.add(new ItemTiki("Item " + i));
        }

        mRecyclerView = findViewById(R.id.recyclerview);

        listItemsTikiAdapter = new ListItemsTikiAdapter(this, listItemTiki);

        mRecyclerView.setAdapter(listItemsTikiAdapter);

        mRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));

    }
}