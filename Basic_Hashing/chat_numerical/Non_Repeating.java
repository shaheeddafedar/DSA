// First Non-Repeating Element

package Basic_Hashing.chat_numerical;

import java.util.HashMap;

public class Non_Repeating {
    public static void main(String[] args) {
        int [] arr = {1, 2, 2, 3, 1, 4};
        non_repeat(arr);
        
    }
    public static void non_repeat(int []arr){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
        }
        for (Integer key : hm.keySet()) {
          int frequency = hm.get(key);
          if (frequency==1) {
            System.out.println(key);
            break;
          }
        }
    }
}
