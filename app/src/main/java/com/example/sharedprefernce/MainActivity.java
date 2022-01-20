package com.example.sharedprefernce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText name,email;
    Button button,button1;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    name=findViewById(R.id.name);
    email=findViewById(R.id.email);
    button=findViewById(R.id.button);
        button1=findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ShowData.class);
                startActivity(intent);
            }
        });

    sp=getSharedPreferences("MyUser", Context.MODE_PRIVATE);
    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String n=name.getText().toString();
            String e=email.getText().toString();
            SharedPreferences.Editor editor=sp.edit();
            editor.putString("name",n);
            editor.putString("email",e);
            editor.commit();
            Toast.makeText(MainActivity.this, "Saved", Toast.LENGTH_SHORT).show();
        }
    });


    }
}