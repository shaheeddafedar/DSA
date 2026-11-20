package DSA_180.recursion_and_backtracking.subsets_combinations;

import java.util.ArrayList;
import java.util.List;

public class extra_Case_Permutation {
    public static void main(String[] args) {
        
    }
    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        backTack_findPerm(s,"",0,ans);
        return ans;
    }
    public void  backTack_findPerm(String s,String temp,int index,  List<String> ans){
      if(index == s.length()){
        ans.add(temp);
        return;
      }
      char ch = s.charAt(index);
      if(Character.isDigit(ch)){
        backTack_findPerm(s,temp+ch,index+1,ans);
      }else {
         backTack_findPerm(s,temp+Character.toLowerCase(ch),index+1,ans);

          backTack_findPerm(s,temp+Character.toUpperCase(ch),index+1,ans);
      }
    }
}
// Time Complexity: O(n * 2^n)
// Space Complexity: O(n * 2^n)