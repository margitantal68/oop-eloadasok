import java.util.ArrayList;

public class StackAggregation {

    private ArrayList<Object> items = new ArrayList<>();
    // the depth of the stack
    private final int capacity;

    public StackAggregation(int capacity) {
        this.capacity = capacity;
    }

    public boolean isFull(){
        return items.size() == capacity;
    }

    public boolean isEmpty(){
        return items.size() == 0;
    }

    public void push( Object object ){
        if( this.isFull() ){
            System.out.println("Stack is full");
            return;
        }
        items.add( object );
    }

    public void pop(){
        if( this.isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        items.remove( items.size() - 1);
    }

    public Object top() throws StackException {
        if( items.isEmpty() ){
            throw new StackException("Stack is empty");
        }
        return items.get(items.size() - 1);
    }

    public int getSize(){
        return items.size();
    }
}
