package DSA_180.recursion_and_backtracking.subsets_combinations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum2 {
    public static void main(String[] args) {
        
    }
    public List<List<Integer>> combinationSum2s(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        backTrack_find2(candidates, target, 0, ans, new ArrayList<>());
        return ans;
    }

    public void backTrack_find2(int[] candidates, int target, int index, List<List<Integer>> ans, List<Integer> list) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        
        for (int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }
            list.add(candidates[i]);
            backTrack_find2(candidates, target - candidates[i], i + 1, ans, list);
            list.remove(list.size() - 1);
        }
    }
}

// Time O(n×2^n)
// space O(n)