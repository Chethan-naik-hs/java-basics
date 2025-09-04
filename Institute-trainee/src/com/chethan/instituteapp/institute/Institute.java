package com.chethan.instituteapp.institute;


import com.chethan.instituteapp.trainee.Trainee;
import com.chethan.instituteapp.validation.TraineeValidation;

public class Institute {

        public Institute(int size){
          trainees = new Trainee[size];
        }
        public Trainee[] trainees ;
        int index;
        TraineeValidation validator = new TraineeValidation();

        public boolean addTrainee(Trainee trainee) {
            boolean isTraineeAdded = false;
            if(trainee != null && validator.validate(trainee)){
                trainees[index++]=trainee;
                isTraineeAdded = true;
            }else System.out.println("Some details are missing");
            return isTraineeAdded;
        }

        public void getAllTrainees() {
            System.out.println("===== Trainee List =====");
            for (Trainee trainee:trainees) {
                System.out.println(trainee.getId());
                System.out.println(trainee.getName());
                System.out.println(trainee.getCourse());
                System.out.println("------------------------------------------");

            }
        }
}

