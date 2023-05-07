package com.example.colorsofcats;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
public class TwoActivity extends AppCompatActivity {
    private ImageButton imageButtonSolid;
    private ImageButton imageButtonTurtle;
    private ImageButton imageButtonTabby;
    private ImageButton imageButtonPoint;
    private ImageButton imageButtonWhite;
    private ImageButton imageButtonSmoky;
    private ImageButton imageButtonChinchillas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_activity);

        imageButtonSolid = findViewById(R.id.imageButtonSolid);
        imageButtonTurtle = findViewById(R.id.imageButtonTurtle);
        imageButtonTabby = findViewById(R.id.imageButtonTabby);
        imageButtonPoint = findViewById(R.id.imageButtonPoint);
        imageButtonWhite = findViewById(R.id.imageButtonWhite);
        imageButtonSmoky = findViewById(R.id.imageButtonSmoky);
        imageButtonChinchillas = findViewById(R.id.imageButtonChinchillas);

        imageButtonSolid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSolid = new Intent(getApplicationContext(), SolidActivity.class);
                intentSolid.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(intentSolid);
            }
        });
        imageButtonTurtle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTurtle = new Intent(getApplicationContext(), TurtleActivity.class);
                intentTurtle.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intentTurtle);
            }
        });
        imageButtonTabby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTabby = new Intent(getApplicationContext(), TabbyActivity.class);
                intentTabby.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intentTabby);
            }
        });
        imageButtonPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPoint = new Intent(getApplicationContext(), PointActivity.class);
                intentPoint.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intentPoint);
            }
        });
        imageButtonWhite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentWhite = new Intent(getApplicationContext(), WhiteActivity.class);
                intentWhite.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intentWhite);
            }
        });
        imageButtonSmoky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSmoky = new Intent(getApplicationContext(), SmokyActivity.class);
                intentSmoky.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intentSmoky);
            }
        });
        imageButtonChinchillas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentChinchillas = new Intent(getApplicationContext(), ChinchillasActivity.class);
                intentChinchillas.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intentChinchillas);
            }
        });
    }
}
