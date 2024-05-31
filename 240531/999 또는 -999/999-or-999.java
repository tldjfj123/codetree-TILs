import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> arr = new ArrayList<Integer>();

        while (true) {
            int n = sc.nextInt();

            if (n == 999 || n == -999) {
                break;
            }

            arr.add(n);
        }

        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;

        for (int a : arr) {
            if (a > maxVal) {
                maxVal = a;
            }

            if (a < minVal) {
                minVal = a;
            }
        }

        System.out.print(maxVal + " " + minVal);
    }
}