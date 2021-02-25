package lecture1;

public class Counter {
    private int value;

    //arnyekolas, shadowing
    public Counter(int value) {
        this.value = value;
    }

    public void inc(){
        ++this.value;
    }

    public int getValue() {
        return value;
    }
}
