import java.util.HashMap;
import java.util.Map;

public class App {
    public static Map<String,Integer> finalMap = new HashMap<String,Integer>();
    public static void main(String[] args) throws Exception {
        System.out.println("Url 1");
        TopThreeWords.topThreeWords("..//Assignment-1//url//url1.txt");
        System.out.println("\nUrl 2");
        TopThreeWords.topThreeWords("..//Assignment-1//url//url2.txt");
        System.out.println("\nUrl 3");
        TopThreeWords.topThreeWords("..//Assignment-1//url//url3.txt");
        System.out.println("\nTotal occurrences across 3 urls : \n");
        MapSort.finalMapSort(finalMap);
    }  
}
