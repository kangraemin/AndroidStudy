package com.example.androidstudy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class LoginResultActivity extends AppCompatActivity {

    TextView tv_RaeminBabo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_RaeminBabo = findViewById(R.id.tv_RaeminBabo);

        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();
        String email = bundle.getString("email");
        String password = bundle.getString("password");

        tv_RaeminBabo.setText(email +"/"+password);


    }
}