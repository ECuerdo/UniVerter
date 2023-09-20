package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TriangleActivity extends AppCompatActivity {
    EditText base, height;
    TextView subs, res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);

        base = (EditText) findViewById(R.id.basetxt);
        height = (EditText) findViewById(R.id.heighttxt);
        subs = (TextView) findViewById(R.id.substitute);
        res = (TextView) findViewById(R.id.result);

    }

    public void solveBtn(View view) {
        double field1 = 0;
        double field2 = 0;
        double ans = 0;

        if(base.getText().toString().isEmpty() || height.getText().toString().isEmpty()){
            Toast.makeText(TriangleActivity.this,"Please enter the value/s.",Toast.LENGTH_SHORT).show();
        }
        else{
            field1 = Double.parseDouble(base.getText().toString());
            field2 = Double.parseDouble(height.getText().toString());
            ans = (field1 * field2) / 2;
            subs.setText("A = ½ ( " + field1 +" * " + field2 + " )");
            res.setText("A = " + ans + " unit²");

        }

    }
}