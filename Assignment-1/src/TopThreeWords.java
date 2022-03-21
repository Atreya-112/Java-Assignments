import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopThreeWords {
   
    
    public static void topThreeWords(String path) {
        String data = FileToString.readFile(path);
        String[] urlData = data.split(" ",0);
        String word = FileToString.readFile("..//Assignment-1//words.txt");
        String[] words = word.split(" ", 0);
        List<String> wordsList = new ArrayList<String>();
        for (String string : words) {
            wordsList.add(string);
        }

        Map<String,Integer> map = new HashMap<String,Integer>();
        for (String string : urlData) {
            if(wordsList.contains(string)){
                if (map.containsKey(string)){
                    int count = map.get(string);
                    map.put(string, count+1);
                }
                else{
                    map.put(string, 1);    
                }
            } 
        }
        for (String string : urlData) {
            if (wordsList.contains(string)) {
                if (!App.finalMap.containsKey(string)) {
                    App.finalMap.put(string, 1);
                }
                else{
                    App.finalMap.put(string, App.finalMap.get(string)+1);   
                }

            }
        }
        MapSort.mapSort(map);
    }
}
