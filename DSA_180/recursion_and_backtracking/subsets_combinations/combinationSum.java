package DSA_180.recursion_and_backtracking.subsets_combinations;

import java.util.ArrayList;
import java.util.List;

public class combinationSum {
    public static void main(String[] args) {
        
    }
    public List<List<Integer>> combinationSums(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        backTrack_findcom(candidates,target,0,new ArrayList<>(),ans);
        return ans;
    }
    public void backTrack_findcom(int [] candidates,int target,int index,List<Integer> list, List<List<Integer>> ans){
        if(index == candidates.length){
            if(target ==0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if(candidates[index]<=target){
            list.add(candidates[index]);
            backTrack_findcom(candidates,target-candidates[index],index,list,ans);
            list.remove(list.size() - 1);
        }
         backTrack_findcom(candidates,target,index+1,list,ans);
    }
}
// Time O(2^(N+⌊T/M⌋)) 
//  space O(N+T/M)