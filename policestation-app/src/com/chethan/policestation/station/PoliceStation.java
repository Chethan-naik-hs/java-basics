package com.chethan.policestation.station;

import com.chethan.policestation.police.Police;
import com.chethan.policestation.validation.Validation;

public class PoliceStation {
    Police[] polices=new Police[8];
    int index=0;
    Validation val  = new Validation();
    public boolean addpolice(Police police){
        boolean isPoliceAdded = false;

        if(police != null && val.validatePolice(police)){
            polices[index]=police;
            isPoliceAdded = true;
            index = index+1;
        }
        return isPoliceAdded;
    }
    public void getAllPolice(){
        System.out.println("==============Police list are============");
        for(Police police:polices){
            System.out.println("police ID : "+police.getPId());
            System.out.println("Police name : "+police.getPName());
            System.out.println("Police position : "+police.getPosition());
            System.out.println("------------------------------------------------");

        }

    }
}
