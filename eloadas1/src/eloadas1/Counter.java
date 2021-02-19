package eloadas1;

public class Counter {
    private int value;

    public Counter(int value) {
        this.value = value;
    }

    public void inc(){
        ++value;
    }

    public int getValue() {
        return value;
    }
}
