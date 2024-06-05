import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = 0;
        
        for (int i = a; i <= b; i++) {
            if (isContain(i) || isMultiple(i)) {
                cnt++;
            }
        }

        System.out.print(cnt);
    }

    // 3, 6, 9 포함
    static boolean isContain(int n) {
        char[] arr = String.valueOf(n).toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '3' || arr[i] == '6' || arr[i] == '9') {
                return true;        
            }
        }

        return false;
    }

    // 자체가 3의 배수
    static boolean isMultiple(int n) {
        if (n % 3 == 0) {
            return true;
        }
        return false;
    }
}