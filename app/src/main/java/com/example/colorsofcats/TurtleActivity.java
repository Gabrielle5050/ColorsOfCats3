package com.example.colorsofcats;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TurtleActivity  extends AppCompatActivity {

private String[] arrayTurtle = {"Чёрно-красная", "Шоколадно-красная", "Циннамон-красная", "Лилово-кремовая",
        "Фавн-кремовая", "Дымчатый черепаховый", "Колор-пойнт", "Биколорные черепахи"};
    ListView turtleList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turtle);
        turtleList = findViewById(R.id.turtleList);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, arrayTurtle);
        turtleList.setAdapter(adapter);
    }
}