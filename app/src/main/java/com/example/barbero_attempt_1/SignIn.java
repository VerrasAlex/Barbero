package com.example.barbero_attempt_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignIn extends AppCompatActivity {

    //Declaring Variables
    private EditText email_input;
    private EditText pswd_input;
    private Button sign_in_btn;
    private ImageButton back_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        //Assigning Variables
        email_input = (EditText) findViewById(R.id.email_input);
        pswd_input = (EditText) findViewById(R.id.pswd_input);
        sign_in_btn = (Button) findViewById(R.id.sign_in_btn);
        back_btn = (ImageButton) findViewById(R.id.back_btn);

        //Action: BackButton
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back_it = new Intent(SignIn.this, BarberoStart.class);
                startActivity(back_it);
            }
        });

        //Action: Sign In Button
        sign_in_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(email_input.getText().equals("") || pswd_input.getText().equals("")){
                    Toast.makeText(SignIn.this, "Missing some arguements there mate!", Toast.LENGTH_LONG).show();
                }else{
                    String email = email_input.getText().toString();
                    String pswd = pswd_input.getText().toString();

                    System.out.println(email + "  " + pswd);
                }
            }
        });
    }

}
