package com.sliitapp.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    public static final String EX_NUMBER_1="com.sliitapp.intentsproj.EX_NUMBER_1";
    public static final String EX_NUMBER_2="com.sliitapp.intentsproj.EX_NUMBER_2";
    private Button btnOK;
    private EditText txt1;
    private EditText txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        LayoutInflater li = getLayoutInflater();
//Getting the View object as defined in the customtoast.xml file
        View layout = li.inflate(R.layout.customtoast, (ViewGroup)
                findViewById(R.id.custom_toast_layout));

        txt1 = findViewById(R.id.txt_act_1);
        txt2 = findViewById(R.id.txt_act_2);

        btnOK = findViewById(R.id.btnOk);
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //toast
                Context context = getApplicationContext();
                CharSequence message = "you just clicked the OK button";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context,message,duration);
                toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);
                toast.show();



                Intent secondAct = new Intent(FirstActivity.this,SecondActivity.class);
                int text1= Integer.parseInt(txt1.getText().toString());
                int text2= Integer.parseInt(txt2.getText().toString());
                secondAct.putExtra(EX_NUMBER_1,text1);
                secondAct.putExtra(EX_NUMBER_2,text2);
                startActivity(secondAct);



            }
        });

        Toast cus_toast = new Toast(getApplicationContext());
        cus_toast.setDuration(Toast.LENGTH_SHORT);
        cus_toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        cus_toast.setView(layout);//setting the view of custom toast layout
        cus_toast.show();


    }
}