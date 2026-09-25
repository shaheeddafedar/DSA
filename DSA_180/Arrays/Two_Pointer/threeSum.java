package DSA_180.Arrays.Two_Pointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class threeSum {
    public static void main(String[] args) {
        int[] arr = { 2, -2, 0, 3, -3, 5 };
        List<List<Integer>> ls = threeSums(arr);
        for (int i = 0; i < ls.size(); i++) {
            System.out.print(ls.get(i) + " ");
        }
    }

    public static List<List<Integer>> threeSums(int[] arr) {
       Set<List<Integer>> set = new HashSet<>();
       for (int i = 0; i < arr.length; i++) {
        Set <Integer> HashSet = new HashSet<>();
        for (int j = i+1; j < arr.length; j++) {
            int third =-(arr[i]+arr[j]);
            if (HashSet.contains(third)) {
                List<Integer> temp = Arrays.asList(
                    arr[i],
                    arr[j],
                    third  
                );
                Collections.sort(temp);
                set.add(temp);
            }
          HashSet.add(arr[j]);

        }
       }
       return new ArrayList<>(set);
        
    }
}

// Brute Force
//  public static List<List<Integer>> threeSums(int[] arr) {
//         Set<List<Integer>> st = new HashSet<>();
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 for (int k = j + 1; k < arr.length; k++) {
//                     if (arr[i] + arr[j] + arr[k] == 0) {
//                         List<Integer> temp = Arrays.asList(
//                                 arr[i], arr[j], arr[k]
//                         );
//                         Collections.sort(temp);
//                         st.add(temp);

//                     }

//                 }
//             }
//         }
//         return new ArrayList<>(st);
//     }
//     Time O(n^3*log(number of unique))
//     space 2*o(no of tuples)

//Better
// public static List<List<Integer>> threeSums(int[] arr) {
//        Set<List<Integer>> set = new HashSet<>();
//        for (int i = 0; i < arr.length; i++) {
//         Set <Integer> HashSet = new HashSet<>();
//         for (int j = i+1; j < arr.length; j++) {
//             int third =-(arr[i]+arr[j]);
//             if (HashSet.contains(third)) {
//                 List<Integer> temp = Arrays.asList(
//                     arr[i],
//                     arr[j],
//                     third  
//                 );
//                 Collections.sort(temp);
//                 set.add(temp);
//             }
//           HashSet.add(arr[j]);

//         }
//        }
//        return new ArrayList<>(set);
        
//     }
    //     Time O(n^2*log M (Size of set))
//     space O(N)+o(numbe of unique triples)