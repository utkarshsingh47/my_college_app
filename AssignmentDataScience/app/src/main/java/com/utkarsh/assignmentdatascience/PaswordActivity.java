package com.utkarsh.assignmentdatascience;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PaswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pasword);

        Button btn_next = findViewById(R.id.btn_next);
        ImageView step1_circle = findViewById(R.id.step1_circle);
        ImageView step2_circle = findViewById(R.id.step2_circle);
        ImageView step3_circle = findViewById(R.id.step3_circle);
        ImageView step4_circle = findViewById(R.id.step4_circle);
        EditText tv_hint_password=findViewById(R.id.tv_hint_password);
        EditText tv_hint_confirm_password=findViewById(R.id.tv_hint_confirm_password);

        step1_circle.setImageResource(R.drawable.progress_ok);
        step2_circle.setImageResource(R.drawable.progress_ok);
        step3_circle.setImageResource(R.drawable.progress_ok);
        step4_circle.setImageResource(R.drawable.pro_disabled);


            btn_next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(PaswordActivity.this, tv_hint_password.getText(), Toast.LENGTH_SHORT).show();
                    Toast.makeText(PaswordActivity.this, tv_hint_confirm_password.getText(), Toast.LENGTH_SHORT).show();
                    if (tv_hint_password.getText().toString().equals(tv_hint_confirm_password.getText().toString()) &&
                            !( tv_hint_password.getText().toString().isEmpty() &&
                            tv_hint_confirm_password.getText().toString().isEmpty())) {
                        startActivity(new Intent(PaswordActivity.this, SplashTwoActivity.class));
                    }
                    else {
                        Toast.makeText(PaswordActivity.this, "Enter correct password", Toast.LENGTH_SHORT).show();
                    }
                }
            });



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}