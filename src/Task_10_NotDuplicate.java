import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task_10_NotDuplicate {
    public static void main(String[] args) {
        try {
            /*
            * Task 10:
            * Print the  numbers which are not duplicate from the given array.
                numbers=[1, 1, 2, 3, 1, 2, 4, 5, 6, 5, 4, 7]
                Output:
                3, 6, 7
             * */
            int [] numbers = {1, 1, 2, 3, 1, 2, 4, 5, 6, 5, 4, 7};
            Map<Integer,Integer> map = new HashMap<>();
            List<Integer> notDuplicates = new ArrayList<>();
            for (int i = 0; i < numbers.length; i++) {
                map.put(numbers[i], map.getOrDefault(numbers[i], 0) + 1);
            }

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 1) {
                    notDuplicates.add(entry.getKey());
                }
            }
            System.out.println(String.join(", ", notDuplicates.stream().map(String::valueOf).toArray(String[]::new)));




        }catch (Exception e){
            System.out.println(e);
        }
    }
}
