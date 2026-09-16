package Array.medium;
public class Majority_Element_I {
    public static void main(String[] args) {
        int[] arr = { 7, 0, 0, 1, 7, 7, 2, 7, 7 };
        int result = majorityElement(arr);
        System.out.println("The Majority Element in array is : " + result);
    }
        public static  int majorityElement(int[] arr) {
        int Element=0;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (count==0) {
                count=1;
                Element=arr[i];
            } else if (arr[i]==Element) {
                count++;
            } else{
                count--;
            }
        }
             int countvalue=0;
          for (int j = 0; j < arr.length; j++) {
            if (arr[j]==Element) {
                countvalue++;
            }
          }
        if (countvalue>arr.length/2) {
            return Element;
        }
        return -1;
    }

}
// Time → O(n)
// Space → O(1)


// Brute Force
// public static int majorityElement(int[] arr) {
// for (int i = 0; i < arr.length; i++) {
// int count=0;
// for (int j = 0; j < arr.length; j++) {
// if (arr[i]==arr[j]) {
// count++;
// }
// }
// if (count>arr.length/2) {
// return arr[i];
// }
// }
// return -1;
// }
// Time → O(n^2)
// Space → O(1)

// Better
// public static int majorityElement(int[] arr) {
// HashMap<Integer, Integer> mp = new HashMap<>();
// for (int i = 0; i < arr.length; i++) {
// mp.put(arr[i], mp.getOrDefault(arr[i], 0)+1);
// }
// for (int i = 0; i < arr.length; i++) {
// if (mp.get(arr[i])>arr.length/2) {
// return arr[i];
// }
// }
// return -1;
// }
// Time → O(n log n)
// Space → O(1)