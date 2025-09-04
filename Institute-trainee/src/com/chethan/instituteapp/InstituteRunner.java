package com.chethan.instituteapp;

import com.chethan.instituteapp.institute.Institute;
import com.chethan.instituteapp.trainee.Trainee;

import java.util.Scanner;

public class InstituteRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size no. of trainers");
        int size = scanner.nextInt();
        Institute institute = new Institute(size);
        System.out.println("Number of trainers : "+institute.trainees.length);
        for (int i = 0; i < size; i++) {
            Trainee trainee = new Trainee();
            System.out.println("Enter trainer Id : ");
            int id = scanner.nextInt();
            trainee.setId(id);

            System.out.println("Enter trainer name");
            String name = scanner.next();
            trainee.setName(name);

            System.out.println("Enter trainer course");
            String course = scanner.next();
            trainee.setCourse(course);

            institute.addTrainee(trainee);
        }

        institute.getAllTrainees();
    }
}

