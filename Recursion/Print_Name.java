package Recursion;

public class Print_Name {
    public static void main(String[] args) {
        name(3);
        
    }
    public static void name( int n){
        if (n==0) {
           return; 
        }
        System.out.println("Shaheed");
        name(n-1);
    }
}
