package DSA_180.recursion_and_backtracking.subsets_combinations;

import java.util.ArrayList;
import java.util.List;

public class powerSet {
    public static void main(String[] args) {
        
    }
    public static List<List<Integer>> powerSets(int[] nums) {
        int n = nums.length;
         List<List<Integer>> list = new ArrayList<>();
         for(int i =0;i<(1<<n);i++){
        List<Integer> temp = new ArrayList<>();
        for(int j =0;j<n;j++){
            if((i&(1<<j))!=0){
                temp.add(nums[j]);
            }
        }
        list.add(temp);
      }
      return list;
    }
}
// Time :O(n×2^n)
// Space:O(n×2^n) 