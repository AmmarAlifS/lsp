package com.example.apklsp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class menu_antar extends AppCompatActivity {

    private EditText etLokasiPenjemputan;
    private EditText etTujuan;
    private Button btnPesanAntar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_antar);

        // Initialize form fields
        etLokasiPenjemputan = findViewById(R.id.et_lokasi_penjemputan);
        etTujuan = findViewById(R.id.et_tujuan);
        btnPesanAntar = findViewById(R.id.btn_pesan_antar);

        // Set button click listener
        btnPesanAntar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle book ride button click
                // Get form data and validate
                String lokasiPenjemputan = etLokasiPenjemputan.getText().toString();
                String tujuan = etTujuan.getText().toString();

                // Call API or perform booking logic here
                // ...
            }
        });
    }
}
