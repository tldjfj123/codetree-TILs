import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2][4];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // 가로
        for (int i = 0; i < 2; i++) { // 외부 반복문 범위 수정
            int rowSum = 0;

            for (int j = 0; j < 4; j++) { // 내부 반복문 범위 수정
                rowSum += arr[i][j];
            }
            double rowAvg = rowSum / (double)4;

            System.out.printf("%.1f ", rowAvg); // 형식 지정 수정
        }

        System.out.println();

        // 세로
        for (int i = 0; i < 4; i++) { // 외부 반복문 범위 수정
            int columnSum = 0;

            for (int j = 0; j < 2; j++) {
                columnSum += arr[j][i];    
            }
            double columnAvg = columnSum / (double)2;

            System.out.printf("%.1f ", columnAvg); // 형식 지정 수정
        }

        System.out.println();

        int totalSum = 0;
        for (int i = 0; i < 2; i++) { // 외부 반복문 범위 수정
            for (int j = 0; j < 4; j++) { // 내부 반복문 범위 수정
                totalSum += arr[i][j];
            }
        }

        double totalAvg = totalSum / (double)8;
        System.out.printf("%.1f", totalAvg);
    }
}