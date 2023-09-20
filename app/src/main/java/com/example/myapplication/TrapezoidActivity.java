package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TrapezoidActivity extends AppCompatActivity {
    EditText base1, base2, height;
    TextView subs, res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapezoid);

        base1 = (EditText) findViewById(R.id.base1txt);
        base2 = (EditText)findViewById(R.id.base2txt);
        height = (EditText) findViewById(R.id.heighttxt);
        subs = (TextView) findViewById(R.id.substitute);
        res = (TextView) findViewById(R.id.result);
    }

    public void solveBtn(View view) {
        double field1 = 0;
        double field2 = 0;
        double field3 = 0;
        double ans = 0;

        if (base1.getText().toString().isEmpty() || height.getText().toString().isEmpty() || base2.getText().toString().isEmpty()) {
            Toast.makeText(TrapezoidActivity.this, "Please enter the value/s.", Toast.LENGTH_SHORT).show();
        } else {
            field1 = Double.parseDouble(base1.getText().toString());
            field2 = Double.parseDouble(base2.getText().toString());
            field3 = Double.parseDouble(height.getText().toString());
            ans = ((field1 + field2) * field3) / 2 ;
            subs.setText("A = ½ ( " + field1 + " + " + field2 + " ) * " + field3);
            res.setText("A = " + ans + " unit²");
        }
    }
}