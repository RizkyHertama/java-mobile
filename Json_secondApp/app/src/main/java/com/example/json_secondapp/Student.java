package com.example.json_secondapp;

import com.google.gson.annotations.SerializedName;

public class Student {
    @SerializedName("name")
    private String mName;

    @SerializedName("email")
    private String mEmail;

    @SerializedName("age")
    private int mAge;

    Course course;
    public Student(String mName, String mEmail, int mAge, Course course) {
        this.mName = mName;
        this.mEmail = mEmail;
        this.mAge = mAge;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "mName='" + mName + '\'' +
                ", mEmail='" + mEmail + '\'' +
                ", mAge=" + mAge +
                ", course=" + course +
                '}';
    }
}
