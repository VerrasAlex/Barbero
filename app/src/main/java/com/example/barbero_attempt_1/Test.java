package com.example.barbero_attempt_1;

import android.app.Activity;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.content.AsyncTaskLoader;

public class Test extends AppCompatActivity {

    private final EditText email = findViewById(R.id.editTextTextEmailAddress);
    private final EditText password = findViewById(R.id.editTextTextPassword);
    private final TextView login = findViewById(R.id.tv_login);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(email.getText().equals("") || password.getText().equals("")) {
                    Toast.makeText(Test.this, "Please fill in your E-mail and Password!", Toast.LENGTH_SHORT).show();
                }
                else{
                    String email_input = email.getText().toString();
                    String password_input = password.getText().toString();

                    //new Task(email_input,password_input).execute();
                }
            }
        });
    }

//    class Task extends AsyncTask<Void,Void,Void>{
//
//    }
}

