import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = sc.next().toCharArray();

        int cnt1 = 0;
        int cnt2 = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == 'e') {
                if (arr[i+1] == 'e') {
                    cnt1++;
                }

                if (arr[i+1] == 'b') {
                    cnt2++;
                }
            }
        }

        System.out.print(cnt1 + " " + cnt2);
    }
}