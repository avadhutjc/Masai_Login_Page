package com.masai.masai_login_page;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignInActivity extends AppCompatActivity {
    private Button BtnSignIn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BtnSignIn2 = findViewById(R.id.BtnSignIn2);
        BtnSignIn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //code
                Intent intent = new Intent(SignInActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }

}