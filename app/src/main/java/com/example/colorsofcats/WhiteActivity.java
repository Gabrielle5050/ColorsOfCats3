package com.example.colorsofcats;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class WhiteActivity extends AppCompatActivity {

    private String[] arrayWhite = {"Классический окрас с белым (биколор, арлекин, ван, триколор, миттед)",
            "Колор-поинт с белым", "Биколорные черепахи (калико)", "Окрасы с белым табби", "Дымчатые с белым окрасы",
            "Смешанные окрасы (биколор черепаховый затушёванный, биколор колор-пойнт завуалированный и др.)"};
    ListView whiteList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_white);
        whiteList = findViewById(R.id.whiteList);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, arrayWhite);
        whiteList.setAdapter(adapter);
    }
}