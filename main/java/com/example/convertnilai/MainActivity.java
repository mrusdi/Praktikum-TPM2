package com.example.convertnilai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   private EditText etNama,etNim,etNilai;
   private Button btnKirim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = findViewById(R.id.ETnama);
        etNim = findViewById(R.id.ETnim);
        etNilai = findViewById(R.id.ETnilai);
        btnKirim = findViewById(R.id.btnkirim);

        btnKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String sNama = etNama.getText().toString();
                    String sNim = etNim.getText().toString();
                    String sNilai = etNilai.getText().toString().trim();

                    if (sNilai.trim().equals("")) {
                        etNilai.setError("Nilai Tidak Boleh Kosong");
                    }

                    double NNilai = Double.parseDouble(sNilai);

                    if (sNama.trim().equals("")){
                        etNama.setError("Nama Tidak Boleh Kosong");
                    } else if (sNim.trim().equals("")){
                        etNim.setError("NIM Tidak Boleh Kosong");
                    }
                    else if  (NNilai > 4) {
                        etNilai.setError("Input tidak boleh Lebih 4");
                    }
                    else{
                        Intent i;
                        i = new Intent(MainActivity.this, MainActivity2.class);
                        i.putExtra("Nama", sNama);
                        i.putExtra("Nim", sNim);
                        i.putExtra("Nilai", sNilai);
                        startActivity(i);
                        }
                    } catch (Exception enp){
                    enp.printStackTrace();
                    Toast.makeText(getApplication(), "Tidak beh kosong",Toast.LENGTH_SHORT);
                }
            }
        });


    }
}