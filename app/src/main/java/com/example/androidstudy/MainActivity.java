package com.example.androidstudy;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    EditText et_email, et_password;
    RelativeLayout rl_btn01;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_login);

        et_email    = findViewById(R.id.et_email);
        et_password = findViewById(R.id.et_password);
        rl_btn01    = findViewById(R.id.rl_Btn01);

        rl_btn01.setClickable(true);
        rl_btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = et_email.getText().toString();
                String password = et_password.getText().toString();

                Intent intent = new Intent( MainActivity.this, LoginResultActivity.class);
                String name;
                intent.putExtra(  "email", email);
                intent.putExtra(  "password", password);
                startActivity(intent);


            }
        });

    }
}