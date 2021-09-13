package com.example.madt_lab_1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvMain = findViewById(R.id.tvMainLabel);

        Button btnChangeText = (Button) findViewById(R.id.btnChangeText);
        Button btnChangeColor = (Button) findViewById(R.id.btnChangeColor);
    }

    public void onBtnChangeTextClick (View view) {
        this.tvMain.setText("The 1st changes! Hooray!!!");
    }

    public void onBtnChangeColorClick (View view) {
        this.tvMain.setTextColor(Color.rgb(255,192,0));
    }
}