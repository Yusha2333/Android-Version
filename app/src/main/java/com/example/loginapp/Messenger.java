package com.example.loginapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

public class Messenger extends AppCompatActivity {

    private String email;
    private String name;
    private RecyclerView messages;
    DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://auth-62897-default-rtdb.firebaseio.com/");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messenger);

        final ImageView userProfilePic = findViewById(R.id.userProfilePic);

        messages = findViewById(R.id.messages);
        //get intent data from MainActivity.class activity
        email = getIntent().getStringExtra("email");
        name = getIntent().getStringExtra("name");

        messages.setHasFixedSize(true);
        messages.setLayoutManager(new LinearLayoutManager(this));

        // get profile pic from firebase database
        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {


            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}