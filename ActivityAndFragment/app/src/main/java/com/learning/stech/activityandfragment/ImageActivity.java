package com.learning.stech.activityandfragment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
    }

    public void returnToMainActivity(View v) {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }
}
