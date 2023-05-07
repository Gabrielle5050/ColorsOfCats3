package com.example.colorsofcats;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ChinchillasActivity extends AppCompatActivity {
    private String[] arrayChinchillas = {"Серебристые затушёванные черепаховые", "Серебристые затушёванные камео",
            "Серебристые затущёванные колор-пойнт", "Серебристые завуалированные", "Серебристые завуалированные камео",
            "Серебристые завуалированные колор-пойнт", "Серебристые завуалированные черепаховые", "Золотые затушёванные", "Золотые завуалированные"};
    ListView chinchillasList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinchillas);
        chinchillasList = findViewById(R.id.chinchillasList);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, arrayChinchillas);
        chinchillasList.setAdapter(adapter);
    }
}