package treeset;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TextStatistics {
    private TreeSet<String> set = new TreeSet<String>();

    public TextStatistics(String filename){
        try(Scanner scanner = new Scanner( new File(filename) )){
            while( scanner.hasNextLine() ){
                String line = scanner.nextLine();
                StringTokenizer stk = new StringTokenizer(line, ", :;()?.!");
                while( stk.hasMoreTokens()){
                    set.add( stk.nextToken().toLowerCase());
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void printAlpahbetically(){
        for(String word: set){
            System.out.print( word +" ");
        }
        System.out.println();
    }

//    public void printReverseAlpahbetically(){
//        Set<String> rset = new TreeSet<String>(new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return s2.compareTo(s1);
//            }
//        });
//
//        rset.addAll(set);
//        for(String word: rset){
//            System.out.print( word +" ");
//        }
//        System.out.println();
//    }

    public void printReverseAlpahbetically(){
        Iterator<String> it = set.descendingIterator();
        while( it.hasNext()){
            System.out.println(it.next()+" ");
        }
        System.out.println();
    }

    public int numWords(){
        return set.size();
    }



}
