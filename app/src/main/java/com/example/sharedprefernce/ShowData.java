package com.example.sharedprefernce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class ShowData extends AppCompatActivity {

    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);
        t1=findViewById(R.id.textView2);
        t2=findViewById(R.id.textView3);
     SharedPreferences sp=getApplicationContext().getSharedPreferences("MyUser", Context.MODE_PRIVATE);
    String name=sp.getString("name","");
    String email=sp.getString("email","");
   t1.setText(name);
   t2.setText(email);


    }
}