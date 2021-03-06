package com.example.jpmorgan.wihm_223;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ClickOnRegister(View v){
        Intent i_register = new Intent(getApplicationContext(), RegisterActivity.class);
        startActivity(i_register);
    }
    public void ClickOnMonitoring(View v){
        Intent i_monitoring = new Intent(getApplicationContext(), MonitorActivity.class);
        startActivity(i_monitoring);
    }
    public void ClickOnRetrieval(View v){
        Intent i_retrieval = new Intent(getApplicationContext(), RetrieveActivity.class);
        startActivity(i_retrieval);
    }
}
