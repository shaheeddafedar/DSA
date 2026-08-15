package Pattern_Matching;

public class Pattern17 {
    public static void main(String[] args) {
        int n=5;
      pattern17(n);
    }

    public static void pattern17(int n){
       
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j<= n-i; j++) {
             System.out.print(" ");
            }
                char ch ='A';
            int breakPoint = (2*i-1)/2;
             for (int j2 = 1; j2 <=2*i-1; j2++) {
                System.out.print(ch);
                if (j2<=breakPoint) {
                    ch++;
                } else {
                    ch--;
                }
             }
              for (int j = 1; j<= n-i; j++) {
             System.out.print(" ");
            }
            
            System.out.println();
        }
    }
}



