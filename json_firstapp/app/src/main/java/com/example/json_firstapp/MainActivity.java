package com.example.json_firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    //Declare TAG tinggal ketik aja logt nanti ada auto correctnya
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();

        /*Serialization -> Serialization adalah proses mengubah objek di dalam kode Java
        (seperti Student) menjadi teks JSON.
         */
        Student student  = new Student("harry", "harry@gmail.com", 22);
        String json = gson.toJson(student);

        /*Decerialization
           Deserialization adalah proses mengubah teks JSON kembali menjadi objek Java.
         */
        String data = " {\"age\":22,\"email\":\"harry@gmail.com\",\"name\":\"harry\"}";
        Student student1 = gson.fromJson(data, Student.class);

        Log.d(TAG, "Ini Serial: " + json);
        Log.d(TAG, "Ini Deceri: " + student1.toString());

    }
}