import java.util.*;

public class Main {
    public static String s, std;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        s = sc.next();
        std = sc.next();

        System.out.print(find(s, std));
    }

    static int find(String s, String std) {
        return s.indexOf(std);
    }
}