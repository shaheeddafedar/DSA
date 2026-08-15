package Pattern_Matching;

public class Pattern15 {
    public static void main(String[] args) {
        int n = 5;
        pattern15(n);
    }

    public static void pattern15(int n) {
        for (int i = 1; i <=n; i++) {
         for (char j = 'A'; j<'A'+(n+1)-i; j++) { //(n-i-1);
            System.out.print(j);
         }
            System.out.println();
        }
    }

}
