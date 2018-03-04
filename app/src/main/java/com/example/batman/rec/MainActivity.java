package com.example.batman.rec;

import android.content.Intent;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
Spinner spinner1;
    TextView t1;
    EditText e,e1,e2,e3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner1=(Spinner)findViewById(R.id.spinner);
e=(EditText)findViewById(R.id.editText);
        e1=(EditText)findViewById(R.id.editText5);
        e2=(EditText)findViewById(R.id.editText6);
        e3=(EditText)findViewById(R.id.editText7);


        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,R.layout.support_simple_spinner_dropdown_item,getResources().getStringArray(R.array.spinner_options));
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);

        Button b1=(Button)findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a,b,c,d;
                a= e.getText().toString();
                b=e1.getText().toString();
                c=e2.getText().toString();
                d=e3.getText().toString();

                Intent i=new Intent(getApplicationContext(),Main2Activity.class);
                i.putExtra("a",a);
                i.putExtra("b",b);
                i.putExtra("c",c);
                i.putExtra("d",d);


                startActivity(i);


            }
        });


    }
}
