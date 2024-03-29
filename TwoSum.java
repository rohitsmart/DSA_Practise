import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] array = new int[]{2, 2, 5, 6, 7};
        int target = 9;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int complement = target - array[i];
            if (map.containsKey(complement)) {
                System.out.println("Indices: " + map.get(complement) + ", " + i);
                break;
            }
            map.put(array[i], i);
            System.out.println("Current map "+map);

        }
    }
}
