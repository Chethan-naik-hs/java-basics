package com.chethan.policestation.validation;

import com.chethan.policestation.police.Police;

public class Validation {
    Police police;
    public boolean validatePolice(Police police){
        boolean isPoliceValidated = false;
        boolean isId = false;
        boolean isName = false;
        boolean isPosition = false;

        if(police.getPId() > 0) isId = true;
        else System.out.println("Invalid user ID");

        if(police.getPName()!=null && !police.getPName().isEmpty()) isName = true;
        else System.out.println("Invalid name");

        if(police.getPosition()!=null && !police.getPosition().isEmpty()) isPosition = true;
        else System.out.println("Invalid position name");

        if(isId && isName && isPosition) isPoliceValidated = true;

        else System.out.println("Some firlds are missing");
        return isPoliceValidated;
    }
}
