package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BMIActivity extends AppCompatActivity {
    EditText heighttext, weighttext;
    TextView result;
    Button btn;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmiactivity);

        heighttext = (EditText)findViewById(R.id.heighttxt);
        weighttext = (EditText)findViewById(R.id.weighttxt);
        result = (TextView) findViewById(R.id.bmirestxt);

        btn = (Button) findViewById(R.id.bmibtn);

    }

    public void bmiBtn(View view) {

        if(heighttext.getText().toString().isEmpty() || weighttext.getText().toString().isEmpty()){
            Toast.makeText(BMIActivity.this,"Please enter the value/s.",Toast.LENGTH_SHORT).show();
        }
        else{
            double height = Double.parseDouble(heighttext.getText().toString());
            double weight = Double.parseDouble(weighttext.getText().toString());
            height = height * height;
            double bmiresult = weight / height;

            result.setText(" " + df.format(bmiresult));
        }


    }
}