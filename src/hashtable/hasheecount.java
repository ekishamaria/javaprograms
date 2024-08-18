package hashtable;
import java.util.*;

public class hasheecount {
    public static void main(String[] args) {
        
        String[] strings = {"eki", "teri", "har", "har", "evva", "eki", "evva"};
        HashMap<String, Integer> frequencyMap = new HashMap<>();
        for (String str : strings) {
            frequencyMap.put(str, frequencyMap.getOrDefault(str, 0) + 1);
        }

        
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(frequencyMap.entrySet());

        
        entryList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        
        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println("String: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }
    }
}
