import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        printStraight(n);
        System.out.println();
        printReverse(n);
    }

    static void printStraight(int n) {
        if(n == 0) {
            return;
        }

        printStraight(n-1);
        System.out.print(n + " ");
        
    }

    static void printReverse(int n) {
        if(n == 0) {
            return;
        }

        System.out.print(n + " ");
        printReverse(n-1);
    }
}