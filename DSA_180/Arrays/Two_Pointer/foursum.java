package DSA_180.Arrays.Two_Pointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class foursum {
    public static void main(String[] args) {
        int[] arr = { 1, -2, 3, 5, 7, 9 };
        List<List<Integer>> ls = fourSum(arr, 7);
        for (int i = 0; i < ls.size(); i++) {
            System.out.print(ls.get(i) + " ");
        }

    }

    public static List<List<Integer>> fourSum(int[] arr, int target) {
       List<List<Integer>> result = new ArrayList<>();
      Arrays.sort(arr);
      for (int i = 0; i < arr.length; i++) {
        if (i>0&& arr[i]==arr[i-1]) {
            continue;
        }
        for (int j = i+1; j < arr.length; j++) {
            if (j!=i+1&&arr[j]==arr[j-1]) {
                continue;
            }
        
        int k = j+1;
        int l = arr.length-1;
        while (k<l) {
            int sum = arr[i]+arr[j]+arr[k]+arr[l]; //Long sum = (long) arr[i]+arr[j]+arr[k]+arr[l];
            if (sum<target) {
                k++;
            } else if (sum>target){
                l--;
            } else{
                List<Integer>temp = Arrays.asList(
                    arr[i],arr[j],arr[k],arr[l]
                );
                k++;
                l--;
                while (k<l&& arr[k]==arr[k-1] ) {
                    k++;
                }
                 while (k<l&& arr[l]==arr[l+1] ) {
                    l--;
                }
                result.add(temp);
            }
        }
    }
      }
      return  result;
        
    }
}
// Time: O(n³)
// Space: O(1) auxiliary space, excluding the output.
// Brute Force
// public static List<List<Integer>> fourSum(int[] arr, int target) {
// Set<List<Integer>> st = new HashSet<>();
// for (int i = 0; i < arr.length; i++) {
// for (int j = i + 1; j < arr.length; j++) {
// for (int k = j + 1; k < arr.length; k++) {
// for (int l = k+1; l < arr.length; l++) {
// if (arr[i] + arr[j] + arr[k]+arr[l] == target) {
// List<Integer> temp = Arrays.asList(
// arr[i], arr[j], arr[k], arr[l]
// );
// Collections.sort(temp);
// st.add(temp);

// }
// }

// }
// }
// }
// return new ArrayList<>(st);
// }
// Time O(n^4)
// space 2*o(no of tuples)

// Better

// public static List<List<Integer>> fourSum(int[] arr, int target) {
// Set<List<Integer>> set = new HashSet<>();
// for (int i = 0; i < arr.length; i++) {
// for (int j = i+1; j < arr.length; j++) {
// Set <Integer> HashSet = new HashSet<>();
// for (int k = j+1; k< arr.length; k++) {
// int fouth = target-(arr[i]+arr[j]+arr[k]);
// if (HashSet.contains(fouth)) {
// List<Integer> temp = Arrays.asList(
// arr[i],
// arr[j],
// arr[k],
// fouth
// );
// Collections.sort(temp);
// set.add(temp);
// }
// HashSet.add(arr[k]);

// }

// }
// }
// return new ArrayList<>(set);
// }
// Time O(n^3*log M (Size of set))
// space O(N)+o(numbe of unique triples)