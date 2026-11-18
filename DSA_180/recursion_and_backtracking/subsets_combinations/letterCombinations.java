package DSA_180.recursion_and_backtracking.subsets_combinations;

import java.util.ArrayList;
import java.util.List;

public class letterCombinations {
    public static void main(String[] args) {
        
    }
    public List<String> letterCombinationss(String digits) {
       List<String> ans = new ArrayList<>();
       if(digits.length()==0){
        return ans;
       }
          String[] phone = {
            "", "", "abc", "def",
            "ghi", "jkl", "mno",
            "pqrs", "tuv", "wxyz"
        };
        backTrack_sol(digits,0,"",ans,phone);
        return ans;
    }
    public void backTrack_sol(String digits,int index, String current, List<String> ans, String[] phone){
        if(index==digits.length()){
            ans.add(current);
            return;
        }
        String letters = phone[digits.charAt(index)-'0'];
        for(int i=0;i<letters.length();i++){
            backTrack_sol(digits,index+1,current+letters.charAt(i),ans,phone);
        }
    }
}
// Time O(n × 4ⁿ)
// space O(n × 4ⁿ)