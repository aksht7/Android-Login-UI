package com.example.akshat.gui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
   private Button sign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sign=findViewById(R.id.sign);
        sign.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                openMain2Activity();
            }
        });
    }
    public void openMain2Activity()
    {
        Intent i=new Intent(this,Main2Activity.class);
        startActivity(i);
    }

}
