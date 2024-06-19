import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        char[] arr = s.toCharArray();

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if (arr[i] == 'C' && arr[j] == 'O' && arr[k] == 'W') {
                        cnt++;
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}