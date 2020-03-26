package com.example.baitaploto2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
// khai bao
    EditText mnhapsomin, mnhapsomax;
    Button mrandom, mchoilai;
    TextView mketqua;
    String chuoisomin, chuoisomax;
    int xuatsomin, xuatsomax, giatrixuat;


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

        mrandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chuoisomin = mnhapsomin.getText().toString();
                chuoisomax = mnhapsomax.getText().toString();

                if (!chuoisomin.equals("") || !chuoisomax.equals("")){
                    Toast.makeText(MainActivity.this,"Bạn nhập thiếu thông tin",Toast.LENGTH_SHORT).show();
                    return;
                }
                xuatsomin = Integer.parseInt(chuoisomin);
                xuatsomax = Integer.parseInt(chuoisomax);

                if (xuatsomin > xuatsomax){
                    Toast.makeText(MainActivity.this,"Bạn nhập sai thông tin rồi",Toast.LENGTH_SHORT).show();
                    return;
                }

mrandom = new Random();
                giatrixuat = mrandom.nextInt(xuatsomax - xuatsomin + 1) + xuatsomin;
                mketqua.setText(String.valueOf(giatrixuat));


            }
        });

    }
}
