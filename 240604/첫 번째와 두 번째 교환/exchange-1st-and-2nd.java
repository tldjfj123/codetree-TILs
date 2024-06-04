import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = sc.next().toCharArray();

        char std1 = arr[0]; // 첫번째 문자
        char std2 = arr[1]; // 두번째 문자

        // 첫번째 -> 두번쨰 바꾸기
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == std1) {
                arr[i] = '2';
            }
        }

        // 두번째 -> 첫번째 바꾸기
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == std2) {
                arr[i] = '1';
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '1') {
                arr[i] = std1;
            }

            if (arr[i] == '2') {
                arr[i] = std2;
            }
        }
        System.out.print(new String(arr));
   
    }
}