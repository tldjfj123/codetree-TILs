import java.util.*;

public class Main {
    static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 선택 정렬 알고리즘
        for (int i = 0; i < n - 1; i++) {
            int min = i;

            // 최소값의 인덱스를 찾는 내부 루프
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            // 최소값을 현재 위치와 교환
            if (min != i) {
                swap(arr, i, min);
            }
        }

        // 정렬된 배열 출력
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}