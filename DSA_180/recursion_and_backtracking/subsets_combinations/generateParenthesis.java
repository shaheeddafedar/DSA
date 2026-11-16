package DSA_180.recursion_and_backtracking.subsets_combinations;

import java.util.ArrayList;
import java.util.List;

public class generateParenthesis {
    public static void main(String[] args) {
        
    }
    public List<String> generateParenthesiss(int n) {
       List<String> list = new ArrayList<>();
       backtrack(list,"",0,0,n);
       return list;
    }
    public void backtrack(List<String> ans,String current, int open, int close, int n){
        if(open == n && close == n){
          ans.add(current);
        }
        if(open<n){
            backtrack(ans,current+"(",open+1,close,n);
        }
        if(close<open){
            backtrack(ans,current+")",open,close+1,n);
        }
    }
}


// Time : O(C n​×n), where Cn is the nth Catalan number.
// Space : O(Cn×n) 