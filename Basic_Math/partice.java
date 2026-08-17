package Basic_Math;

public class partice {
    public static void main(String[] args) {
        int digit =7789;
  
       while (digit!=0) {
        int singledigit = digit%10;
        System.out.println(singledigit);
    digit=digit/10;   
    }
    }
}
