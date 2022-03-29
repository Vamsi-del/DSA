package com.objectOriented;

import java.util.stream.LongStream;

public class Students {
    private String studentsNames,roll,city,college;
    int i;
    Students[] details = new Students[100];
    public Students(String name, String roll, String city , String college) {
        this.studentsNames = name;
        this.roll = roll+"";
        this.city = city;
        this.college = college;
    }

    public void saveData(Students students) {
        details[i] = students;
        System.out.println(details[i].studentsNames+"             "+details[i].roll+"              "+details[i].city+"               "+details[i].college);
        i++;
    }
}
