package Basic_Hashing.chat_numerical;

import java.util.HashSet;

public class Unique {
    public static void main(String[] args) {
        
        int [] arr = {1, 2, 2, 3, 1};
        int result = check_Unique(arr);
        System.out.println(result);
    }
    public static int  check_Unique(int [] arr){
        int count=0;
        HashSet <Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        return set.size();
    }
}
