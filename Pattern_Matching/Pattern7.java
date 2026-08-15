package Pattern_Matching;

public class Pattern7 {
    public static void main(String[] args) {
        int n=5;
      pattern7(n);
    }

    public static void pattern7(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j<= n-i; j++) {
             System.out.print(" ");
            }
             for (int j2 = 1; j2 <=2*i-1; j2++) {
                System.out.print("*");
             }
              for (int j = 1; j<= n-i; j++) {
             System.out.print(" ");
            }
            System.out.println();
        }
    }
}



