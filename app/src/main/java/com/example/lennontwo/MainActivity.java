package com.example.lennontwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    void initViews(){
        Button b_open_detail=(Button) findViewById(R.id.b_open_detail);
        b_open_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDetailActivity();
            }
        });
    }
    void openDetailActivity(){
        Intent intent=new Intent(this,DetailActivity.class);
        startActivity(intent);
    }
}