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
    public void sleepSuccess() throws InterruptedException {
        String result = sleepObject.sleep("seconds", 10);

        assertEquals(result, "Success");
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