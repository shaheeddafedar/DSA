package DSA_180.recursion_and_backtracking.subsets_combinations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets_II {
    public static void main(String[] args) {
        
    }
     public List<List<Integer>> subsetsWithDup(int[] nums) {
    List<List<Integer>> ans = new ArrayList<>();
    Arrays.sort(nums);
    backTrack_findCom2(nums,0,ans,new ArrayList<>());
    return ans;
    }
    public void backTrack_findCom2(int [] nums,int start ,List<List<Integer>> ans,List<Integer> list ){
        ans.add(new ArrayList<>(list));
        for(int i =start;i<nums.length;i++){
            if(i >start && nums[i]==nums[i-1]){
                continue;
            }
            list.add(nums[i]);
            backTrack_findCom2(nums,i+1,ans,list);
            list.remove(list.size()-1);
        }
    }
}
// Time O(n×2^n)
// space O(n×2^n)