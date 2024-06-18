import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        char[] arr = s.toCharArray();

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) { // 뒤집을 숫자 정하기
            int tmp = 0;
            for (int j = 0; j < arr.length; j++) { // 같은 자릿수 숫자면 넘기기
                if (j == i) {
                    if (arr[j] == '0') {
                        tmp += Math.pow(2, s.length()-j-1);
                    }
                } else {
                    if (arr[j] == '1') {
                        tmp += Math.pow(2, s.length()-j-1);
                    }
                }
            }
            max = Math.max(max, tmp);
        }

        System.out.print(max);
    }
}