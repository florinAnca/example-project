package com.proj;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class Sleep {

    // metoda sleep care returneaza un string si primeste ca parametrii un sting si un integer
    public String sleep (String unit, int value) throws InterruptedException {

    // verifica daca valoare primita prin unit este seconds
        // in caz afirmativ activitatea thread-ul se suspenda pentru un timp(valoarea primita prin unit)

        long timeToSleep = 0;

        switch(unit){
            case "seconds" :
                timeToSleep = TimeUnit.SECONDS.toMillis(value);
                break;
            case "minutes" :
                timeToSleep = TimeUnit.MINUTES.toMillis(value);
                break;
            case "hour" :
                timeToSleep = TimeUnit.HOURS.toMillis(value);
                break;
            default:
                throw new RuntimeException("Sleep unit is not seconds!");
        }

        Thread.sleep(timeToSleep);
        return "Success";
        /*if (Objects.equals(unit, "seconds")) {


            Thread.sleep(TimeUnit.SECONDS.toMillis(value));
            return "Success";
        }

        //in caz negativ se arunca o runtimeException
        else
            throw new RuntimeException("Sleep unit is not seconds!");*/
    }
}
