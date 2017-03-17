package com.example.johnnylee.reportcard;

import java.util.HashMap;

/**
 * Created by johnnylee on 3/16/17.
 */

public class ReportCard {

    //full name of the student
    private String mFullName;

    //a hashmap of course to grade
    private HashMap<String, Double> mGrades;

    //the academic year
    private int mYear;

    public ReportCard(String fullName, HashMap<String, Double> grades, int year){
        mFullName = fullName;
        mGrades = grades;
        mYear = year;
    }


    public String getFullName(){
        return mFullName;
    }

    public HashMap<String, Double> getGrades(){
        return mGrades;
    }

    public double getGradeForCourse(String course)
    {
        return mGrades.get(course);
    }

    public int getYear()
    {
        return mYear;
    }

    private void setFullName(String fullName){
        mFullName = fullName;
    }

    private void setGrades(HashMap grades){
        mGrades = grades;
    }

    private void setGradeForCourse(String course, double grade)
    {
        mGrades.put(course,grade);
    }

    private void setYear(int year)
    {
        mYear = year;
    }

    @Override
    public  String toString(){
        String message = "Full Name: " + mFullName + '\n';
        message += "Year: " +mYear + '\n';

        for(String course : mGrades.keySet())
        {
            double grade = mGrades.get(course);
            message += "Course: " + course + "Grade: " + grade + '\n';
        }

        return message;
    }





}
