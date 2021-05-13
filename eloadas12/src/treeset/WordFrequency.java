package treeset;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class WordFrequency {
    private Map<String, Counter> frequency = new TreeMap<>();

    public WordFrequency(String filename) {
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                StringTokenizer stk = new StringTokenizer(line, ", :;()?.!");
                while (stk.hasMoreTokens()) {
                    String word = stk.nextToken();
                    Counter counter = frequency.get(word);
                    if (counter == null) {
                        //nem talalhato a szo a frequency asszociativ tombben (map)
                        frequency.put(word, new Counter(1));
                    } else {
                        //mar megvan a szo az asszociativ tombben
                        counter.inc();
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void print(){
        for( Map.Entry<String, Counter> entry: frequency.entrySet()){
            System.out.println( entry.getKey() +" : " + entry.getValue().getCounter());
        }
    }

}
