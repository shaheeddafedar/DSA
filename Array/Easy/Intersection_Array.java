package Array.Easy;

import java.util.ArrayList;

public class Intersection_Array {
    public static void main(String[] args) {
        int[] arr1 = { 1, 1, 2, 2};
        int[] arr2 = { 2, 2 };
        int[] result = intersection(arr1, arr2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
            
        }
    }
  public  static  int[] intersection(int [] arr1, int [] arr2){
    int i=0;
    int j=0;
    ArrayList<Integer> temp = new ArrayList<>();
    while (i<arr1.length && j<arr2.length) {
        if (arr1[i]>arr2[j]) {
           i++;        
        } else if (arr1[i]<arr2[j]) {
           j++;        
        } else{
            temp.add(arr1[i]);
            i++;
            j++;
        }
    }
     int[] result = new int[temp.size()];
        for (int k = 0; k < result.length; k++) {
            result[k] = temp.get(k);
        }
        return result;
  }
    
}

// Time complexity O(n * m);
// Space complexity O(1);


// Brute force
// Time complexity O(n * m);
// Space complexity O(n^2);
// public static int[] intersection(int[] arr1, int[] arr2) {
//         ArrayList<Integer> temp = new ArrayList<>();
//         for (int i = 0; i < arr1.length; i++) {
//             for (int j = 0; j < arr2.length; j++) {
//                 if (arr1[i] == arr2[j]) {
//                     if (!temp.contains(arr1[i])) {

//                         temp.add(arr1[i]);
//                         break;

//                     }
//                 }

//             }
//         }
//         int[] result = new int[temp.size()];
//         for (int k = 0; k < result.length; k++) {
//             result[k] = temp.get(k);
//         }
//         return result;
//     }
