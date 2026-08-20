package Basic_Hashing.chat_numerical;

import java.util.HashSet;

public class duplicate {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4};
        if (check_value(arr)) {
            System.out.println("duplicate found");
        } else{
            System.out.println("duplicate not found");
        }
        
    }
    public static boolean check_value(int []arr){
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (hs.contains(arr[i])) {
                return true;
            }
            hs.add(arr[i]);
        }
        return false;
    
    }
}
