package treeset;

public class Main {
    public static void main(String[] args) {
//        TextStatistics stat = new TextStatistics("eloadas12/bible.txt");
//        System.out.println( "Number of distinct words: " + stat.numWords() );
////        stat.printAlpahbetically();
//        stat.printReverseAlpahbetically();
// 2. feladat
        WordFrequency freq = new WordFrequency( "eloadas12/bible.txt");
        freq.print();
    }
}
