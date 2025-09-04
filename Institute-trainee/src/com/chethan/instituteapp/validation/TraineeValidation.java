package com.chethan.instituteapp.validation;

import com.chethan.instituteapp.trainee.Trainee;

public class TraineeValidation {

        public boolean validate(Trainee trainee) {
            boolean isValid = false;
            boolean isId = false;
            boolean isName = false;
            boolean isCourse = false;
            if (trainee.getId() > 0) {
                isId = true;
            }else System.out.println("Invalid Trainee ID");


            if (trainee.getName() != null && !trainee.getName().isEmpty()) {
                isName = true;
            }else System.out.println("Invalid Trainee Name");

            if (trainee.getCourse() != null && !trainee.getCourse().isEmpty()) {
                isCourse = true;
            }else System.out.println("Invalid Course");

            if(isId && isName && isCourse) isValid = true;
            else System.out.println("Some fields are missing");

            return isValid;
        }
}

