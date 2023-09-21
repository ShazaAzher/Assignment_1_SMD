package com.example.assignment_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page_3 extends AppCompatActivity {

    Button signup_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_3);
        signup_btn = findViewById(R.id.signup_btn_reg);

        signup_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEmailVer();
            }
        });
    }

    public void openEmailVer(){
        Intent intent = new Intent(this, page_4.class);
        startActivity(intent);
    }
}