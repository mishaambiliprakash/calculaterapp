package com.sup.administrator.calculaterapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class addactivity extends AppCompatActivity {
EditText ed1,ed2,ed3,ed4;
    Button b1,b2;
    String s1,s2,s3,s4;
    Integer number1,number2,number3,number4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addactivity);
        ed1=(EditText)findViewById(R.id.num1);
        ed2=(EditText)findViewById(R.id.num2);
        ed3=(EditText)findViewById(R.id.num3);
        ed4=(EditText)findViewById(R.id.result);
        b1=(Button)findViewById(R.id.butadd);
        b2=(Button)findViewById(R.id.butback);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=ed1.getText().toString();
                s2=ed2.getText().toString();
                s3=ed3.getText().toString();
                number1=Integer.parseInt(s1);
                number2=Integer.parseInt(s2);
                number3=Integer.parseInt(s3);
                number4=number1+number2+number3;
                s4=String.valueOf(number4);
                ed4.setText(s4);
                ed4.setVisibility(View.VISIBLE);
                Toast.makeText(getApplicationContext(),s4,Toast.LENGTH_LONG).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(x);
            }
        });

    }
}
