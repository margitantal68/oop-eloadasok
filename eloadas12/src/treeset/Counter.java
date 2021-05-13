package treeset;

public class Counter {
    private long counter;

    public Counter() {
    }

    public Counter(long counter) {
        this.counter = counter;
    }

    public void inc(){
        ++counter;
    }
    public long getCounter(){
        return counter;
    }
}
