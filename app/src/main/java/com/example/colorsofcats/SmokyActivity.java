package com.example.colorsofcats;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SmokyActivity extends AppCompatActivity {
    private String[] arraySmoky = {"Классический дымчатый", "Дымчатый биколор", "Дымчатый колор-пойнт",
            "Дымчатый черепаховый"};
    ListView smokyList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smoky);
        smokyList = findViewById(R.id.smokyList);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, arraySmoky);
        smokyList.setAdapter(adapter);
    }
}