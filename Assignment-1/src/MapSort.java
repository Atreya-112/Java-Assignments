import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.util.Map.Entry;

public class MapSort{
    public static void mapSort(Map<String,Integer> map) {
      	List<Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
		Collections.sort(entries, new Comparator<Entry<String,Integer>>(){

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				if (o1.getValue() > o2.getValue()) {
					return -1;
				}
				else{
					return 1;
				}
			}
			
		});
		for (int i = 0; i < 3; i++) {
			System.out.println(entries.get(i));
		}
    }
	public static void finalMapSort(Map<String,Integer> map) {
		List<Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
	  Collections.sort(entries, new Comparator<Entry<String,Integer>>(){

		  @Override
		  public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
			  if (o1.getValue() > o2.getValue()) {
				  return -1;
			  }
			  else{
				  return 1;
			  }
		  }
		  
	  });
	  for (Entry<String,Integer> entry : entries) {
		  System.out.println(entry.getKey() + "=" + entry.getValue());
	  }
  }
}
