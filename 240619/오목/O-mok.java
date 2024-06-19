import java.util.*;

public class Main {
    static int n = 19;
    static int[][] arr = new int[19][19];
    static int x, y;
    static boolean isDone = false;
    static int res = 0;
    static boolean isRow = false;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // 가로 확인
        for (int i = 0; i < 19; i++) { // 열만 바꿔서 확인
            int isOne = 0;
            int isTwo = 0;

            for (int j = 0; j < 19; j++) {
                if (arr[i][j] == 1) {
                    isOne++;
                    isTwo = 0;

                    if (isOne >= 5) {
                        isDone = true;
                        x = i;
                        y = j;
                        res = 1;
                        isRow = true;
                        break;
                    }
                } else if (arr[i][j] == 2) {
                    isTwo++;
                    isOne = 0;

                    if (isTwo >= 5) {
                        isDone = true;
                        x = i;
                        y = j;
                        res = 2;
                        isRow = true;
                        break;
                    }
                } else {
                    isTwo = 0;
                    isOne = 0;
                }

                if (isDone) {
                    break;
                }
            }
        }

        // 세로 확인
        for (int i = 0; i < 19; i++) { // 행만 바꿔서 확인
            int isOne2 = 0;
            int isTwo2 = 0;

            for (int j = 0; j < 19; j++) {
                if (arr[j][j] == 1) {
                    isOne2++;
                    isTwo2 = 0;

                    if (isOne2 >= 5) {
                        isDone = true;
                        x = i;
                        y = j;
                        res = 1;
                        break;
                    }
                } else if (arr[i][j] == 2) {
                    isTwo2++;
                    isOne2 = 0;

                    if (isTwo2 >= 5) {
                        isDone = true;
                        x = i;
                        y = j;
                        res = 2;
                        break;
                    }
                } else {
                    isTwo2 = 0;
                    isOne2 = 0;
                }

                if (isDone) {
                    break;
                }
            }
        }

        if (isRow) {
            System.out.println(res);
            System.out.println((x + 1) + " " + (y - 1));
        } else {
            System.out.println(res);
            System.out.println((x - 1) + " " + (y + 1));
        }



    }
}