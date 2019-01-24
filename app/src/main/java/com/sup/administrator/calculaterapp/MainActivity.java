package com.sup.administrator.calculaterapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button b1,b2,b3,b4,b5,b6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.add);
        b2=(Button)findViewById(R.id.sub);
        b3=(Button)findViewById(R.id.mul);
        b4=(Button)findViewById(R.id.div);
        b5=(Button)findViewById(R.id.large);
        b6=(Button)findViewById(R.id.small);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getApplicationContext(),addactivity.class);
                startActivity(a);

                }


        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e=new Intent(getApplicationContext(),subactivity.class);
                startActivity(e);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),mulactivity.class);
                startActivity(i);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o=new Intent(getApplicationContext(),divactivity.class);
                startActivity(o);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent u=new Intent(getApplicationContext(),largestactivity.class);
                startActivity(u);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Intent v=new Intent(getApplicationContext(),smallestactivity.class);
                startActivity(v);


            }
        });
    }
}
