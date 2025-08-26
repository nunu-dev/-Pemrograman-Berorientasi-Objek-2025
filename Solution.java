import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input
        String A = sc.next();
        String B = sc.next();
        
        // 1. Jumlah panjang A dan B
        System.out.println(A.length() + B.length());
        
        // 2. Cek apakah A > B secara leksikografis
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        // 3. Kapital huruf pertama A dan B
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capitalizedA + " " + capitalizedB);
        
        sc.close();
    }
}
