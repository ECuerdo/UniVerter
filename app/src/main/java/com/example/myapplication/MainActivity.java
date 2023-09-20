package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cv1Button(View view) {
        startActivity(new Intent(this, TempertatureActivity.class));
    }
    public void cv2Button(View view) {
        startActivity(new Intent(this,RectangleActivity.class));
    }
    public void cv3Button(View view) {

        startActivity(new Intent(this, TriangleActivity.class));
    }
    public void cv4Button(View view) {
        startActivity(new Intent(this,BMIActivity.class));
    }
    public void cv55Button(View view) {
        startActivity(new Intent(this, TrapezoidActivity.class));
    }
    public void cv6Button(View view) { startActivity(new Intent(this, CircleActivity.class));

    }

    public void aboutBtn(View view) { startActivity(new Intent(this, AboutActivity.class));

    }
}