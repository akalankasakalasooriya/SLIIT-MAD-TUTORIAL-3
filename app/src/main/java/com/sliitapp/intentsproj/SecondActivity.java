package com.sliitapp.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private EditText txtNum1;
    private EditText txtNum2;

    private TextView txtResult;

    private Button btnPlus;
    private Button btnMinus;
    private Button btnDivide;
    private Button btnMulti;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txtNum1 = findViewById(R.id.editTextTextPersonName3);
        txtNum2 = findViewById(R.id.editTextTextPersonName4);

        Intent intent = getIntent();
        final int number1 = intent.getIntExtra(FirstActivity.EX_NUMBER_1,0);
        final int number2 = intent.getIntExtra(FirstActivity.EX_NUMBER_2,0);

        txtNum1.setText(""+number1);
        txtNum2.setText(""+number2);


        //calculation
        txtResult= findViewById(R.id.textView5);
        btnPlus = findViewById(R.id.button2);
        btnMinus = findViewById(R.id.button3);
        btnMulti = findViewById(R.id.button4);
        btnDivide = findViewById(R.id.button5);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResult.setText(""+(number1+number2));
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResult.setText(""+(number1-number2));
            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResult.setText(""+(number1*number2));
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResult.setText(""+((float)number1/(float) number2));
            }
        });







    }
}