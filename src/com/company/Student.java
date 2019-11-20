package com.company;

import javax.swing.*;

public class Student {
    // Properties/Fields
    private String studentName;
    private char sex;
    private double studentScore;
    private boolean free;

    // explicitly creat default constructor
    Student(){
        free = true;
    }



    // Setter/Mutator Methods
    public void setSex(char s){
        sex = s;
    }

    public void setName(String name){
        studentName = name;
    }
    public void setScore(double score){
        studentScore = score;
    }
    public void setFree(Boolean c)
    {
        free = c;
    }


    // Getter/Accessor Methods
    public int getSex(){
        return sex;
    }
    public String getName(){
        return studentName;
    }
    public double getScore(){
        return studentScore;
    }
    public Boolean getFree()
    {
        return free;
    }

}
