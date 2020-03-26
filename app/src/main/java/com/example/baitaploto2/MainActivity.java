package com.example.baitaploto2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
// khai bao
    EditText mnhapsomin, mnhapsomax;
    Button mrandom, mchoilai;
    TextView mketqua;
    String chuoisomin, chuoisomax;
    int xuatsomin, xuatsomax;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //anh xa
        mnhapsomin = findViewById(R.id.nhapsomin);
        mnhapsomax = findViewById(R.id.nhapsomax);
        mrandom = findViewById(R.id.random);
        mchoilai = findViewById(R.id.choilai);
        mketqua = findViewById(R.id.Ketqua);

    }
}
