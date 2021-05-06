package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PostfixExpressionEvaluation evaluation = new PostfixExpressionEvaluation();
        // try with resources
        try( Scanner scanner = new Scanner( new File("eloadas11/expressions.txt")) ){
            while( scanner.hasNextLine() ){
                String line = scanner.nextLine();
                try {
                    System.out.println("Evaluate("+line+"): " + evaluation.evaluate( line ));
                } catch (ExpressionException e) {
                    System.out.println("Wrong expression: " + line);
                    System.out.println("\t"+e.getMessage());
//                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
