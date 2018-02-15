package com.example.user.loginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private static EditText username;
    private static EditText password;
    private static TextView attemp;
    private static Button btnlogin;
    int attemp_counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        onClickLogin();
    }

    public void onClickLogin() {
        username = (EditText) findViewById(R.id.editText_UserName);
        password = (EditText) findViewById(R.id.editText_password);
        attemp = (TextView) findViewById(R.id.textView);
        btnlogin = (Button) findViewById(R.id.button);

        attemp.setText(Integer.toString(attemp_counter));

        btnlogin.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (username.getText().toString().equals("user") && password.getText().toString().equals("pass")) {
                            Toast.makeText(Login.this, "User Name and Password Correct", Toast.LENGTH_SHORT).show();
                            Intent intent=new Intent("layout.user.User");
                            startActivity(intent);
                        } else {
                            Toast.makeText(Login.this, "User Name and Password inCorrect", Toast.LENGTH_SHORT).show();
                            attemp_counter--;
                            attemp.setText(Integer.toString(attemp_counter));
                            if (attemp_counter == 0) {
                                btnlogin.setEnabled(false);
                            }

                        }
                    }

                }
        );

    }
}