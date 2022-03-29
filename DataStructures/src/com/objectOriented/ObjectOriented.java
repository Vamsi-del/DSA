package com.objectOriented;

import com.Faker.*;

import java.util.Random;

public class ObjectOriented {

    public static void main(String[] args) {
//        Random random = new Random();
//        Faker faker = new Faker();
//        int i = 0;
//        while(i<4){
//            Students students = new Students(faker.name(), random.nextInt(10000)+""+ faker.alphabetizes()+""+ random.nextInt(10000), faker.city(), faker.College());
//            students.saveData(students);
//            i++;
//        }
        InsideObject insideObject = new InsideObject(new ItemData(3,4),new InsideObject());
        insideObject.save(insideObject);
    }
}
