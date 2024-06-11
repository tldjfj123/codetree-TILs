import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String N = sc.next();

        int n = Integer.parseInt(N, 2) * 17;

        System.out.print(Integer.toBinaryString(n));
    }
}