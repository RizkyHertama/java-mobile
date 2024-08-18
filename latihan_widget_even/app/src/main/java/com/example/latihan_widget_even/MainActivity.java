package com.example.latihan_widget_even;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

//    TextView judul;
//    EditText input;

    EditText angka1, angka2;
    Button hitung;
    TextView hasil;
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        judul=findViewById(R.id.judul);
//        input=findViewById(R.id.input);

//        input.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence isian, int start, int before, int count) {
//                judul.setText(isian.toString());
//                judul.setText(input.getText().toString());
//                judul.setText(String.valueOf(start));
//                judul.setText(String.valueOf(before));
//                judul.setText(String.valueOf(count));
//                judul.setText(String.valueOf(input.getText().length()));
//
//                Log.d(TAG, "Ini Isian Judul: " + isian.toString());
//                Log.d(TAG, "Ini Input Text: " + input.getText().toString());
//                Log.d(TAG, "Posisi Awal Perubahan: " + String.valueOf(start));
//                Log.d(TAG, "Jumlah Karakter Sebelum Perubahan: " + String.valueOf(before));
//                Log.d(TAG, "Jumlah Karakter Ditambahkan/Dihapus: " + String.valueOf(count));
//                Log.d(TAG, "Jumlah Panjang Karakter: " + String.valueOf(input.getText().length()));
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//            }
//        });

        angka1=findViewById(R.id.angka1);
        angka2=findViewById(R.id.angka2);
        hitung=findViewById(R.id.hitung);
        hasil=findViewById(R.id.hasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nilai_angka1=angka1.getText().toString();
                String nilai_angka2=angka2.getText().toString();

                int integer_angka1=Integer.valueOf(nilai_angka1);
                int integer_angka2=Integer.valueOf(nilai_angka2);
                int hasil_jumlah=integer_angka1+integer_angka2;

                hasil.setText("Hasilnya " + String.valueOf(hasil_jumlah));
            }
        });
    }
}