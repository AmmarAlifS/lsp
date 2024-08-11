package com.example.apklsp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class menu_jemput extends AppCompatActivity  {

    private EditText etlokasijemput;
    private EditText ettujuanlokasi;
    private Button btnpesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_jemput);

        // Initialize form fields
        etlokasijemput = findViewById(R.id.et_lokasijemput);
        ettujuanlokasi = findViewById(R.id.et_tujuanlokasi);
        btnpesan = findViewById(R.id.btn_pesan);

        // Set button click listener
        btnpesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle book ride button click
                // Get form data and validate
                String lokasiPenjemputan = ettujuanlokasi.getText().toString();
                String tujuan = etlokasijemput.getText().toString();

                // Call API or perform booking logic here
                // ...
            }
        });
    }
}
