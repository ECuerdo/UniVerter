package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RectangleActivity extends AppCompatActivity {
    EditText base, height;
    TextView subs, res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle);

        base = (EditText) findViewById(R.id.lengthtxt);
        height = (EditText) findViewById(R.id.widthtxt);
        subs = (TextView) findViewById(R.id.substitute);
        res = (TextView) findViewById(R.id.result);
    }

    public void solveBtn(View view) {
        double field1 = 0;
        double field2 = 0;
        double ans = 0;

        if (base.getText().toString().isEmpty() || height.getText().toString().isEmpty()) {
            Toast.makeText(RectangleActivity.this, "Please enter the value/s.", Toast.LENGTH_SHORT).show();
        } else {
            field1 = Double.parseDouble(base.getText().toString());
            field2 = Double.parseDouble(height.getText().toString());
            ans = (field1 * field2) ;
            subs.setText("A = " + field1 + " * " + field2 );
            res.setText("A = " + ans + " unit²");
        }
    }
}