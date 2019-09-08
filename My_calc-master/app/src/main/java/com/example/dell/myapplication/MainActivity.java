package com.example.dell.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5;
    TextView t1;
    EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        t1=(TextView)findViewById(R.id.textView);

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                float f1=Float.parseFloat(s1);
                float f2=Float.parseFloat(s2);
                float f3=f1+f2;
                String s3=Float.toString(f3);
                t1.setText(s3);


            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                float f1=Float.parseFloat(s1);
                float f2=Float.parseFloat(s2);
                float f3=f1-f2;
                String s3=Float.toString(f3);
                t1.setText(s3);


            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                float f1=Float.parseFloat(s1);
                float f2=Float.parseFloat(s2);
                float f3=f1/f2;
                String s3=Float.toString(f3);
                t1.setText(s3);


            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                float f1=Float.parseFloat(s1);
                float f2=Float.parseFloat(s2);
                float f3=f1*f2;
                String s3=Float.toString(f3);
                t1.setText(s3);


            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                float f1=Float.parseFloat(s1);
                float f2=Float.parseFloat(s2);
                float f3=f1%f2;
                String s3=Float.toString(f3);
                t1.setText(s3);


            }
        });

    }
}
