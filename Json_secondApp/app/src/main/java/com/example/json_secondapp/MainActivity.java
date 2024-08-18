package com.example.json_secondapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();

        //Contoh Objek di dalam Objek
        //Objek course didalam objek student
        Course  course  = new Course("Java", 250000);
        Student student = new Student("Jhon", "Jhon@gmail.com", 19, course);

        //SERIALIZATION
        String json = gson.toJson(student);

        //DECERIALIZATION
        String data = " {\"course\":{\"course_name\":\"Java\",\"fees\":250000},\"age\":19,\"email\":\"Jhon@gmail.com\",\"name\":\"Jhon\"}";
        Student student1 = gson.fromJson(data, Student.class);

        Log.d(TAG, "Ini Student" + json);
        Log.d(TAG, "Ini Student1" + student1.toString());

    }
}