package lecture1;

public class Counter {
    private int value;

    //arnyekolas, shadowing
    // this.value - attributum
    // value - parameter (lokalis)
    // a lokalis value elarnyekolja a value attributumot, ezert --> this.value
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
