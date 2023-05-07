package com.example.colorsofcats;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class SolidActivity extends AppCompatActivity {
    private String[] arraySolid = {"Белый", "Черный", "Шоколадный", "Голубой",
            "Лиловый", "Циннамон", "Фавн", "Красный", "Кремовый"};
    ListView solidList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solid);
        solidList = findViewById(R.id.solidList);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, arraySolid);
        solidList.setAdapter(adapter);
    }






}