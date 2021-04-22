public class MainStack {
    public static void main(String[] args) {
        StackAggregation stack = new StackAggregation( 5 );
        for( int i=0; i<10; ++i){
            stack.push( i );
        }
        for( int i=0; i<10; i++){
            try {
                System.out.println( stack.top());
                stack.pop();
            } catch (StackException e) {
                System.out.println( e.toString() );
            }
        }
    }
}
