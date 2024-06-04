import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);

        if (c > 'a') {
            System.out.print((char)(c-1));
        } else {
            System.out.print('z');
        }
    }
}