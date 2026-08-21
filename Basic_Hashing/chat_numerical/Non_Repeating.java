// First Non-Repeating Element

package Basic_Hashing.chat_numerical;

import java.util.HashMap;

public class Non_Repeating {
    public static void main(String[] args) {
        int [] arr = {1, 2, 2, 3, 1, 4};
        int result =non_repeat(arr);
        System.out.println(result);
        
    }
    public static int non_repeat(int []arr){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
        }
        int unique=0;
    for (int i = 0; i <arr.length; i++) {
        if (hm.get(arr[i])==1) {
            unique=arr[i];
            break;
        }
    }
        
        return unique;
    }
}
