package com.example.arapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        EditText loginEmailEdittext = findViewById(R.id.loginEmail);
        EditText loginPassEdittext = findViewById(R.id.loginPassword);
        TextView errorBoxTextView = findViewById(R.id.errorBox);

        ImageButton loginButton = findViewById(R.id.loginBtn);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login(loginEmailEdittext, loginPassEdittext, errorBoxTextView);
            }
        });
    }
    public void login(EditText loginEmailEdittext, EditText loginPassEdittext, TextView errorBoxTextView) {

        String loginEmail = loginEmailEdittext.getText().toString().trim();
        String loginPass = loginPassEdittext.getText().toString().trim();
        String errorBox = errorBoxTextView.getText().toString().trim();

        if (loginEmail.equals("Admin") || loginEmail.equals("admin")) {
            if (loginPass.equals("Admin") || loginPass.equals("admin")) {
                Intent iDashboard = new Intent(Login.this, MainActivity.class);
                startActivity(iDashboard);
                finish();
            } else {
                errorBoxTextView.setText("Incorrect Password!!");
            }
        } else {
            errorBoxTextView.setText("Incorrect Email!!");
        }
    }
}