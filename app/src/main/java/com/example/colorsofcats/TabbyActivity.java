package com.example.colorsofcats;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class TabbyActivity extends AppCompatActivity {

    private String[] arrayTabby = {"Табби мрамор", "Табби пятно", "Табби полоса", "Рисунчатые с белым черепахи",
            "Рисунчатые черепахи", "Серебристный пятнистый", "Серебристый полосатый", "Серебристый мраморный",
            "Серебристый тикированный", "Золотой пятнистый", "Золотой полосатый", "Золотой тикированный"};
    ListView tabbyList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabby);
        tabbyList = findViewById(R.id.tabbyList);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, arrayTabby);
        tabbyList.setAdapter(adapter);
    }
}