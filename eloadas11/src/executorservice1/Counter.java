package executorservice1;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private AtomicInteger value = new AtomicInteger() ;

    public int getNextValue(){
        return value.incrementAndGet();
    }

    public int getValue(){
        return value.intValue();
    }

}