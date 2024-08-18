package com.example.json_secondapp;

import com.google.gson.annotations.SerializedName;

public class Course {
    @SerializedName("course_name")
    private String coursName;
    @SerializedName("fees")
    private int mFees;

    public Course(String coursName, int mFees) {
        this.coursName = coursName;
        this.mFees = mFees;
    }

    @Override
    public String toString() {
        return "Course{" +
                "coursName='" + coursName + '\'' +
                ", mFees=" + mFees +
                '}';
    }
}
