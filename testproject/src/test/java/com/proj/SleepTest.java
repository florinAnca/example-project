package com.proj;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SleepTest {

    private Sleep sleepObject;

    @Before
    public void setUp() throws Exception {
        sleepObject = new Sleep();
    }

    @Test
    public void sleepSeconds() throws InterruptedException {
        String result = sleepObject.sleep("seconds", 10);

        assertEquals(result, "Success");
    }

    @Test
    public void sleepEmptyValue() throws InterruptedException {

        try {
            String result = sleepObject.sleep("", 10);
        }
        catch (RuntimeException e){
            assertEquals(e.getMessage() ,"Sleep unit is not seconds!" );}
    }

    @Test

    public void maxRange() throws InterruptedException{

        try{
            String result = sleepObject.sleep("seconds" , 2147483647 +1 );
        }
        catch(RuntimeException e){
            assertEquals(e.getMessage(), "timeout value is negative");
        }
    }

    @Test

    public void sleepMinutes () throws InterruptedException{

        String result = sleepObject.sleep("minutes" , 1);

        assertEquals(result , "Success");
    }

    @Test

    public void sleepHours () throws InterruptedException{

        String result = sleepObject.sleep("hour" , 1);

        assertEquals(result , "Success");
    }


    @Test
    public void sleepFailure() throws InterruptedException {
        try {
            sleepObject.sleep("seconds", 10);
        }
        catch (RuntimeException e) {
            assertEquals(e.getMessage(), "Sleep unit is not seconds!");
        }
    }
}