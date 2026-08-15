package Pattern_Matching;

public class Pattern18 {
    public static void main(String[] args) {
        int n=5;
      pattern18(n);
    }

    public static void pattern18(int n){

        for (int i = 1; i <=n; i++) {
            for (char j = 'E'-i; j <='E'; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}



