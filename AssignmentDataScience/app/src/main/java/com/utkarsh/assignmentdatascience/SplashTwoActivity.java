package com.utkarsh.assignmentdatascience;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SplashTwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pasword);

        Button btn_next = findViewById(R.id.btn_next);

        TextView txt_signin=findViewById(R.id.txt_signin);
        ImageView step1_circle = findViewById(R.id.step1_circle);
        ImageView teaching_img = findViewById(R.id.teaching_img);
        ImageView step2_circle = findViewById(R.id.step2_circle);
        ImageView step3_circle = findViewById(R.id.step3_circle);
        ImageView step4_circle = findViewById(R.id.step4_circle);
        LinearLayout section=findViewById(R.id.section);
        LinearLayout txttxt=findViewById(R.id.txttxt);
        ConstraintLayout main=findViewById(R.id.main);


        step1_circle.setImageResource(R.drawable.progress_ok);
        step2_circle.setImageResource(R.drawable.progress_ok);
        step3_circle.setImageResource(R.drawable.progress_ok);
        step4_circle.setImageResource(R.drawable.progress_ok);
        teaching_img.setImageResource(R.drawable.sup_completed);


        txt_signin.setVisibility(View.INVISIBLE);
        section.setVisibility(View.INVISIBLE);
        txttxt.setVisibility(View.INVISIBLE);

        btn_next.setText("Continue");

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SplashTwoActivity.this,MainActivity.class));
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}