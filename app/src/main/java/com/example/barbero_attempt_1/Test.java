package com.example.barbero_attempt_1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Test extends AppCompatActivity {

    private EditText email;
    private EditText password;
    private TextView login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        email = findViewById(R.id.editTextTextEmailAddress);
        password = findViewById(R.id.editTextTextPassword);
        login = findViewById(R.id.tv_login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(email.getText().equals("") || password.getText().equals("")) {
                    Toast.makeText(Test.this, "Please fill in your E-mail and Password!", Toast.LENGTH_SHORT).show();
                }
                else{
                    String email_input = email.getText().toString();
                    String password_input = password.getText().toString();
                    Intent sUp_It = new Intent(Test.this, SignUp.class);
                    startActivity(sUp_It);
                    //new Task(email_input,password_input).execute();
                }
            }

        });
    }


//    class Task extends AsyncTask<Void,Void,Void>{
//
//    }
}

