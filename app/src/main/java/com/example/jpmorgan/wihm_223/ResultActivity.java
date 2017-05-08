package com.example.jpmorgan.wihm_223;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
    }
    public void ClickForGraph(View v){
        Intent i_ClickForGraph= new Intent(getApplicationContext(), GraphActivity.class);
        startActivity(i_ClickForGraph);
    }
}
