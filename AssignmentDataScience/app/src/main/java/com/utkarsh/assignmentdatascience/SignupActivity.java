package com.utkarsh.assignmentdatascience;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_signup);



//        else if (login_et_password.getText().toString().length()<6) {
//        Toast.makeText(MainActivity.this, "Password Length to small", Toast.LENGTH_SHORT).show();
//
//        }

        Button btn_next = findViewById(R.id.btn_next);
        ImageView step1_circle = findViewById(R.id.step1_circle);
        ImageView step2_circle = findViewById(R.id.step2_circle);
        ImageView step3_circle = findViewById(R.id.step3_circle);
        ImageView step4_circle = findViewById(R.id.step4_circle);




        step1_circle.setImageResource(R.drawable.pro_disabled);
        step2_circle.setImageResource(R.drawable.pro_disabled);
        step3_circle.setImageResource(R.drawable.pro_disabled);
        step4_circle.setImageResource(R.drawable.pro_disabled);


        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignupActivity.this,EmailActivity.class));
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}