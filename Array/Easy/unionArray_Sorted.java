package Array.Easy;

import java.util.TreeSet;

public class unionArray_Sorted {
    public static void main(String[] args) {
        int [] arr1 ={1, 2, 3, 4, 5};
        int [] arr2 ={1, 2, 7};
        int [] result = unionArray(arr1, arr2);
        for (int i = 0; i < result.length; i++) {
            
            System.out.print(result[i]+ " ");
        }
        
    }

    
}




// Brute forec  
//public static int[] unionArray(int[] nums1, int[] nums2) {
//         TreeSet<Integer> temp = new TreeSet<>();
//         for (int i = 0; i < nums1.length; i++) {
//             temp.add(nums1[i]);
//         }
//          for (int i = 0; i < nums2.length; i++) {
//             temp.add(nums2[i]);
//         }
//         int n =  temp.size();
//         int [] newarray = new int[n];
       
//         int j = 0;
//         for (int value : temp) {
//             newarray[j] = value;
//             j++;
//         }

//         return newarray;
//     }
// time complexity = o(nlog n);
// Space complexity O(n);