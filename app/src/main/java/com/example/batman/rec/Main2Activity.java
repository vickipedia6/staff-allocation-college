package com.example.batman.rec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
TextView t1,t2,t3,t4,t5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1=(TextView)findViewById(R.id.textView3);
        Intent i1=getIntent();
String n1=i1.getStringExtra("a");
        String n2=i1.getStringExtra("b");
        String n3=i1.getStringExtra("c");
        String n4=i1.getStringExtra("d");
        int e=Integer.parseInt(n1);
        int e1=Integer.parseInt(n2);
        int e2=Integer.parseInt(n3);
        int e3=Integer.parseInt(n4);

int sum=e+e1+e2+e3;
        t1.setText(Integer.toString(sum));
int r=9;
        t2=(TextView)findViewById(R.id.textView18);
        t3=(TextView)findViewById(R.id.textView19);
        t4=(TextView)findViewById(R.id.textView20);

        float professor=(float)sum/(15*r);
        float aop=(float)sum*2/(15*r);
        float ap=(float)sum*6/(15*r);
        int professor1=(int)Math.round(professor);
        int aop1=(int)Math.round(aop);
        int ap1=(int)Math.round(ap);

        t2.setText(Integer.toString(professor1));
        t3.setText(Integer.toString(aop1));
        t4.setText(Integer.toString(ap1));
        int total=professor1+aop1+ap1;
        t5=(TextView)findViewById(R.id.textView9);
        t5.setText(Integer.toString(total));



    }
}
