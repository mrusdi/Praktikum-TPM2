package com.example.convertnilai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView tvhNama;
    TextView tvhNim;
    TextView tvhNilai;
    private String sNama;
    private String sNim;
    private String sNilai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvhNama = (TextView) findViewById(R.id.TVhnama);
        tvhNim = (TextView) findViewById(R.id.TVhnim);
        tvhNilai = (TextView) findViewById(R.id.TVhnilai);
        Bundle extras = getIntent().getExtras();

        sNama = extras.getString("Nama");
        sNim = extras.getString("Nim");
        sNilai= extras.getString("Nilai");

        tvhNama.setText(": " +sNama);
        tvhNim.setText(": " +sNim);

        double NNilai = Double.parseDouble(sNilai);
              if (NNilai == 1.00) {tvhNilai.setText(": D ");}
        else  if (NNilai <= 1.33) {tvhNilai.setText(": D+");}
        else  if (NNilai <= 1.66) {tvhNilai.setText(": C-");}
        else  if (NNilai <= 2.00) {tvhNilai.setText(": C ");}
        else  if (NNilai <= 2.33) {tvhNilai.setText(": C+");}
        else  if (NNilai <= 2.66) {tvhNilai.setText(": B-");}
        else  if (NNilai <= 3.00) {tvhNilai.setText(": B ");}
        else  if (NNilai <= 3.33) {tvhNilai.setText(": B+");}
        else  if (NNilai <= 3.66) {tvhNilai.setText(": A-");}
        else  if (NNilai <= 4.00) {tvhNilai.setText(": A ");}
        else {tvhNilai.setText("tidak boleh lebih dari 4 ");}
    }

    public void Pindah(View view) {
        Intent intent =  new Intent (MainActivity2.this, MainActivity.class);
        startActivity(intent);
    }
}

