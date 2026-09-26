package DSA_180.Arrays.Two_Pointer;

import java.util.ArrayList;
import java.util.Arrays;
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
      Arrays.sort(arr);
      for (int i = 0; i < arr.length; i++) {
        if (i>0&& arr[i]==arr[i-1]) {
            continue;
        }
        int j = i+1;
        int k = arr.length-1;
        while (j<k) {
            int sum = arr[i]+arr[j]+arr[k];
            if (sum<0) {
                j++;
            } else if (sum>0){
                k--;
            } else{
                List<Integer>temp = Arrays.asList(
                    arr[i],arr[j],arr[k]
                );
                j++;
                k--;
                while (j<k&& arr[j]==arr[j-1] ) {
                    j++;
                }
                 while (j<k&& arr[k]==arr[k+1] ) {
                    k--;
                }
                set.add(temp);
            }
        }
      }
      return  new ArrayList<>(set);
    }
}
//     Time O(n log n + ) o(n^2)
//     space o(no of tuples)


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