package com.utkarsh.assignmentdatascience;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView forgetpawd;
    Button loginbtn;
    EditText login_et_username,login_et_password;
    TextView register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        forgetpawd=findViewById(R.id.forgetpawd);
        loginbtn=findViewById(R.id.loginbtn);
        login_et_password=findViewById(R.id.login_et_password);
        login_et_username=findViewById(R.id.login_et_username);
        register=findViewById(R.id.register);


        forgetpawd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Forget_pass.class));
            }
        });


        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (login_et_username.getText().toString().isEmpty()||
                        login_et_password.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "All Fields Are Required", Toast.LENGTH_SHORT).show();                    System.out.println("entrt all");
                }  else{
                    startActivity(new Intent(MainActivity.this,MainActivity.class));
                }
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SignupActivity.class));
            }
        });
    }

    }
