package Array.Easy;

import java.util.HashMap;

public class longest_Sub_array {
  public static void main(String[] args) {
    int[] arrs = { 10, 5, 2, 7, 1, 9 };
    int result = longestSubarray(arrs, 15);
    System.out.println("The Length is: " + result);

  }

  public static int longestSubarray(int[] arr, int k) {
    long sum = 0;
    int maxlength = 0;
    HashMap<Long, Integer> prefsum = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
      if (sum == k) {
        maxlength = Math.max(maxlength, i + 1);
      }
      long rember = sum - k;
      if (prefsum.containsKey(rember)) {
        int lenght = i - prefsum.get(rember);
        maxlength = Math.max(maxlength, lenght);
      }
      if (!prefsum.containsKey(sum)) {
        prefsum.put(sum, i);
      }
    }
    return maxlength;
  }
}

// Brute force
// public static int longestSubarray(int[] arr, int k) {
// int lenght = 0;
// for (int i = 0; i < arr.length; i++) {
// int sum = 0;
// for (int j = i; j < arr.length; j++) {
// sum += arr[j];
// if (sum == k) {
// lenght = Math.max(lenght, j - i + 1);
// }
// }
// }
// return lenght;
// }
// Time complexity O(n^2);
// Space complexity O(1);
