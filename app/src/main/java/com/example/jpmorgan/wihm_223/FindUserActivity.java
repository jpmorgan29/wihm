package com.example.jpmorgan.wihm_223;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class FindUserActivity extends AppCompatActivity {
    //private ListView list_data;
    //private List<User> list_users = new ArrayList<>();
    //private DatabaseReference mFirebaseReference;

    //Firebase
    private FirebaseDatabase mFirebaseDatabase;
    private DatabaseReference mFirebaseReference;
    private User selectedUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_user);
    }
    public void ClickOnPair(View v){
        Intent i_ClickOnPair= new Intent(getApplicationContext(), SearchBTDevicesActivity.class);
        startActivity(i_ClickOnPair);
    }
}
