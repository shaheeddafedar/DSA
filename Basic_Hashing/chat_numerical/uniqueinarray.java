// Check If Two Arrays Have Common Elements
package Basic_Hashing.chat_numerical;

import java.util.HashSet;

public class uniqueinarray {
    
    public static void main(String[] args) {
        int []arr1 ={1, 2, 3, 4};
        int []arr2={7, 8, 3, 9};
        if (check(arr1, arr2)) {
            System.out.println("true");
        } else{
            System.out.println("False");
        }
    }
    public static boolean check(int []arr1,int []arr2){
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if (hs.contains(arr2[i])) {
                return true;
            }
        }
        return false;
    }
}
