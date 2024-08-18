package hashtable;
import java.util.HashMap;

public class count {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 3, 3, 4, 4, 4, 4};
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int number : numbers) {
            
            if (frequencyMap.containsKey(number)) {
                
                frequencyMap.put(number, frequencyMap.get(number) + 1);
            } else {
                
                frequencyMap.put(number, 1);
            }
        }

       
        int size = frequencyMap.size();

        
        Integer[] keys = new Integer[size];
        Integer[] values = new Integer[size];

       
        int index = 0;
        for (HashMap.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            keys[index] = entry.getKey();
            values[index] = entry.getValue();
            index++;
        }

        
        for (int i = 0; i < size; i++) {
            System.out.println("Number: " + keys[i] + ", Frequency: " + values[i]);
        }
    }
}
