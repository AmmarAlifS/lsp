package com.example.apklsp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText emailEditText;
    private EditText passwordEditText;
    private Button loginButton;
    private Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailEditText = findViewById(R.id.email);
        passwordEditText = findViewById(R.id.password);
        loginButton = findViewById(R.id.login);
        registerButton = findViewById(R.id.register);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // Validasi input
                if (email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Mohon isi semua field", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Proses login
                // TODO: Implementasi proses login disini
                Toast.makeText(MainActivity.this, "Login berhasil", Toast.LENGTH_SHORT).show();

                // Pindah ke activity menu utama
                Intent intent = new Intent(MainActivity.this, MenuUtama.class);
                startActivity(intent);
            }
        });

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke activity register
                startActivity(new Intent(MainActivity.this, register.class));
            }
        });
    }
}