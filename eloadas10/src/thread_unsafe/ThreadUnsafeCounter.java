package thread_unsafe;

public class ThreadUnsafeCounter {
    private int counter;

    public void increment(){
            ++counter;
    }

    public int getCounter(){
        return counter;
    }

}
