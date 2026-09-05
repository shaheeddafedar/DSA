// Given an integer array nums, move all the 0's to the end of the array. The relative order of the other elements must remain the same.
// This must be done in place, without making a copy of the array.

package Array.Easy;
public class MoveZerostoEnd {
    public static void main(String[] args) {
        int [] arr = {0, 1, 4, 0, 5, 2};
move_Zeros(arr);
        
    }
    public static void move_Zeros(int [] arr){
        int j =-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0) {
                j=i;
                break;
            }
        }
        for (int i = j+1; i < arr.length; i++) {
            if (arr[i]!=0) {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

// Time complexity O(n);
// Space complexity O(1);




// Brute force    
//public static void move_Zeros(int [] nums){
//         ArrayList<Integer> temp = new ArrayList<>();

//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i]!=0) {
//                 temp.add(nums[i]);
//             }
//         }
//         int nonzero = temp.size();
//         for (int i = 0; i <nonzero; i++) {
//             nums[i]=temp.get(i);
//         }
//         for (int i = nonzero; i < nums.length; i++) {
//             nums[i]=0;
//         }
//         for (int i = 0; i < nums.length; i++) {
//          System.out.print(nums[i]+" ");   
//         }
//     }
// 
