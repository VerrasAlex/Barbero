package com.example.barbero_attempt_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BarberoStart extends AppCompatActivity {

    private TextView sign_in_btn;
    private TextView sign_up_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barbero_start);

        sign_in_btn = (TextView)findViewById(R.id.sign_in_btn);
        sign_up_btn = (TextView) findViewById(R.id.sign_up_btn);


        sign_in_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sIn_It = new Intent(BarberoStart.this, SignIn.class);
                startActivity(sIn_It);
            }
        });

        sign_up_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sUp_It = new Intent(BarberoStart.this, SignUp.class);
                startActivity(sUp_It);
            }
        });
    }
}
