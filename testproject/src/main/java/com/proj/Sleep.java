package com.proj;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class Sleep {

    public void sleep (String unit, Integer value) throws InterruptedException {

        if (Objects.equals(unit, "seconds"))
            Thread.sleep(TimeUnit.SECONDS.toMillis(value));
        else
            throw new RuntimeException("Sleep unit is not seconds!");
    }
}
