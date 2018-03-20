package com.example.robin.myapplication2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main6Activity extends AppCompatActivity {
    public void click(View view)
    {
        Intent intent = new Intent(Main6Activity.this, Main7Activity.class);
        startActivity(intent);
    }
    public void click1(View view)
    {
        Intent intent = new Intent(Main6Activity.this, Main8Activity.class);
        startActivity(intent);
    }

    public void click3(View view)
    {
        Intent intent = new Intent(Main6Activity.this, Main10Activity.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }
}
