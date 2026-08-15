package Pattern_Matching;

public class Pattern9 {
    public static void main(String[] args) {
        int n=5;
      pattern9(n);
    }

    public static void pattern9(int n){
                for (int i = 1; i <=n; i++) {
            for (int j = 1; j<= n-i; j++) {
             System.out.print(" ");
            }
             for (int j2 = 1; j2 <=2*i-1; j2++) {
                System.out.print("*");
             }
            System.out.println();
                    for (int i2 = n; i2>=1; i2--) {
            for (int j = 1; j<= n-i2; j++) {
             System.out.print(" ");
            }
             for (int j2 = 1; j2 <=2*i2-1; j2++) {
                System.out.print("*");
             }
            System.out.println();
        }
        }

    }
}