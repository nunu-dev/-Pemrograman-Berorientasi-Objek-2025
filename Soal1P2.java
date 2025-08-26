import java.util.*;

public class Soal1P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // jumlah test case
        
        for (int i = 0; i < T; i++) {
            String numStr = sc.next();
            try {
                long n = Long.parseLong(numStr);
                System.out.println(n + " can be fitted in:");
                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE)
                    System.out.println("* byte");
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE)
                    System.out.println("* short");
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE)
                    System.out.println("* int");
                System.out.println("* long");
            } catch (Exception e) {
                System.out.println(numStr + " can't be fitted anywhere.");
            }
        }
        sc.close();
    }
}
