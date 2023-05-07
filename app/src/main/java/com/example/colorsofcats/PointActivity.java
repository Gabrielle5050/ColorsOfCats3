package com.example.colorsofcats;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class PointActivity extends AppCompatActivity {
    private String[] arrayPoint = {"Чёрный-пойнт", "Шоколадный-пойнт", "Голубой-пойнт", "Лиловый-пойнт",
            "Циннамон-пойнт", "Фавн-пойнт", "Красный-пойнт", "Кремовый-пойнт","Колор-пойнт черепахи",
            "Колор-пойнт биколор", "Затушеванный колор-пойнт", "Завуалированный колор-пойнт", "Дымчатый колор-поинт"};
    ListView pointList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_point);
        pointList = findViewById(R.id.pointList);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, arrayPoint);
        pointList.setAdapter(adapter);
    }
}
