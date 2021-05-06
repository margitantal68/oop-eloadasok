package exceptions;

import java.util.EmptyStackException;
import java.util.Stack;

public class PostfixExpressionEvaluation {
    // Forbid instantiation!
    public PostfixExpressionEvaluation(){
    }

    public double evaluate( String expression ) throws ExpressionException {
        // reszeredmenyek tarolasa
        Stack<Double> stack = new Stack<>();
        // egysegekre bontas
        String [] items = expression.split(" ");
        for( String item: items ){
            item = item.trim();
            // operator
            if( isOperator(item)){
                // kivesszuk a verem ket felso elemet es elvegezzuk a muveletet
                // ha nincsen legalabb 2 elem a veremben --> kivetelt dobunk
                try{
                    double operand1 = stack.pop();
                    double operand2 = stack.pop();
                    switch( item ){
                        case "+": stack.push(operand1 + operand2); break;
                        case "-": stack.push(operand1 - operand2); break;
                        case "*": stack.push(operand1 * operand2); break;
                        case "/": stack.push(operand2 / operand1); break;
                    }
                }catch( EmptyStackException e ){
                    throw new ExpressionException("Wrong postfix expression");
                }
            }
            // operandus
            else{
                try{
                    stack.push( Double.parseDouble(item));
                }catch(NumberFormatException e ){
                    throw new ExpressionException("Wrong operand: " + item);
                }
            }
        }
        try{
            return stack.pop();
        }catch( EmptyStackException e ){
            throw new ExpressionException("Wrong postfix expression");
        }
    }

    private boolean isOperator(String item ){
        item = item.trim();
        return item.equals("+") || item.equals("*") || item.equals("-") || item.equals("/");
    }
}
