package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.text.DecimalFormat;

public class TempertatureActivity extends AppCompatActivity {
    EditText tfield;
    ToggleButton tb;
    TextView res, sol;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tempertature);

        tfield = (EditText) findViewById(R.id.edtext);
        res = (TextView) findViewById(R.id.result);
        sol = (TextView) findViewById(R.id.solution);
        tb = (ToggleButton) findViewById(R.id.toggleButton);

    }

    public void tempBtn(View view) {
        double answer = 0;

        if(tfield.getText().toString().isEmpty()){
            Toast.makeText(TempertatureActivity.this,"Please enter the temperature",Toast.LENGTH_SHORT).show();
        }
        else if(tb.isChecked()){
            answer = Double.parseDouble(tfield.getText().toString());
            double cel = (answer * 9) / 5 + 32;
            res.setText(df.format(cel) + " °F");
            sol.setText(answer + " * 9 / 5 + 32");
        }
        else{
            answer = Double.parseDouble(tfield.getText().toString());
            double fah = (answer - 32) * 5 / 9;
            res.setText(df.format(fah) + " °C");
            sol.setText(answer + " - 32 * 5 / 9");
        }
    }
}