package com.example.apklsp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuUtama extends AppCompatActivity {
    private Button btnAntar;
    private Button btnJemput;
    private Button btnTracking;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_utama);

        btnAntar = findViewById(R.id.btn_antar);
        btnJemput = findViewById(R.id.btn_jemput);
        btnTracking = findViewById(R.id.btn_tracking);

        btnAntar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle klik button antar
                Toast.makeText(MenuUtama.this, "Menu Antar", Toast.LENGTH_SHORT).show();
                // TODO: Implementasi menu antar disini
            }
        });

        btnJemput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle klik button jemput
                Toast.makeText(MenuUtama.this, "Menu Jemput", Toast.LENGTH_SHORT).show();
                // TODO: Implementasi menu jemput disini
            }
        });

        btnTracking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle klik button tracking
                Toast.makeText(MenuUtama.this, "Menu Tracking", Toast.LENGTH_SHORT).show();
                // TODO: Implementasi menu tracking disini
            }
        });
    }
}
