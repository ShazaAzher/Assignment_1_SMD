package com.example.assignment_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button login_btn;
    TextView signup_btn;

    TextView forgot_pass_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login_btn = (Button) findViewById(R.id.login_btn);
        signup_btn = findViewById(R.id.signup_btn);
        forgot_pass_btn = findViewById(R.id.forgot_pass);

        forgot_pass_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                forgot_pass();
            }
        });

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNewActivity();
            }
        });

        signup_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSignup();
            }
        });



    }

    public void forgot_pass(){
        Intent intent = new Intent(this, page_2.class);
        startActivity(intent);
    }

    public void openNewActivity(){
        Intent intent = new Intent(this, page_2.class);
        startActivity(intent);
    }

    public void openSignup(){
        Intent intent = new Intent(this, page_3.class);
        startActivity(intent);
    }
}