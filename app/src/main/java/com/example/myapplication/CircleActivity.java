package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.text.DecimalFormat;

public class CircleActivity extends AppCompatActivity {
    EditText tfield;
    ToggleButton tb;
    TextView res, sol, formu;
    private static final DecimalFormat df = new DecimalFormat("0.00");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);

        tfield = (EditText) findViewById(R.id.edtext);
        formu = (TextView) findViewById(R.id.formula);
        res = (TextView) findViewById(R.id.result);
        sol = (TextView) findViewById(R.id.substitute);
        tb = (ToggleButton) findViewById(R.id.toggleButton);

    }

    public void tempBtn(View view) {
        double answer = 0;

        if(tfield.getText().toString().isEmpty()){
            Toast.makeText(CircleActivity.this,"Please enter value.",Toast.LENGTH_SHORT).show();
        }
        else if(tb.isChecked()){
            answer = Double.parseDouble(tfield.getText().toString());
            double dia = 0.25 * (3.141592653589793238462643383279502884197 * (answer * answer));
            formu.setText("A = ¼πd²");
            res.setText("A = " + df.format(dia) + " unit²");
            sol.setText("A = ¼ (3.14(" + answer + ")²)");
        }
        else{
            answer = Double.parseDouble(tfield.getText().toString());
            double radius = 3.141592653589793238462643383279502884197 * (answer * answer);
            formu.setText("A = πr²");
            res.setText("A = " + df.format(radius) + "  unit²" );
            sol.setText("A = 3.14(" + answer + ")²");
        }
    }
}