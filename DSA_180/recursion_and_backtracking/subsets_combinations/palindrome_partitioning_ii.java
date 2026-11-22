package DSA_180.recursion_and_backtracking.subsets_combinations;

public class palindrome_partitioning_ii {
    public static void main(String[] args) {
        
    }

    class Solution {
    public int minCut(String s) {
       int [] ans = {Integer.MAX_VALUE};
       findPart2(s,0,0,ans);
       return ans[0];
    }
    public void findPart2(String s,int start ,int cut,int [] ans){
        if(start == s.length()){
         ans[0] = Math.min(ans[0], cut - 1);
            return;
        }
        for(int i = start;i<s.length();i++){
            String temp = s.substring(start,i+1);
            if(ispalindrome(temp)){
                findPart2(s,i+1,cut+1,ans);
            }
        }
    }
    public boolean ispalindrome(String s){
        String copy="";
        for(int i =s.length()-1;i>=0;i--){
            copy+=s.charAt(i);
        }
        if(copy.equals(s)){
            return true;
        }
        return false;
    }
}


}
