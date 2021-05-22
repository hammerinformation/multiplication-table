package com.....
import android.widget.Button;

import java.util.Random;


class Questions {


    private static Questions _instance=null;

    public static Questions getInstance() {
        if(_instance==null){
            _instance=new Questions();


        }
        return _instance;
    }


    public int randomNumber(int max,int min) {
        Random random = new Random();
        int number =random.nextInt(max - min + 1) + min;

        return number;
    }


}