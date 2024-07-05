import java.util.*;

public class Main {
    public static int calc(int[][] arr, int[] xArr, int[] yArr) {
        // 1. x 3개 y 0개
        if (xArr.length >= 3) {
            for (int i = 0; i < xArr.length; i++) {
                for (int j = i + 1; j < xArr.length; j++) {
                    for (int k = j + 1; k < xArr.length; k++) {
                        int line1 = xArr[i];
                        int line2 = xArr[j];
                        int line3 = xArr[k];

                        boolean[] check = new boolean[arr.length];
                        for (int t = 0; t < arr.length; t++) {
                            if (arr[t][0] == line1 || arr[t][0] == line2 || arr[t][0] == line3) {
                                check[t] = true;
                            }
                        }

                        if (allChecked(check)) {
                            return 1;
                        }
                    }
                }
            }
        }

        // 2. x 2개 y 1개
        if (xArr.length >= 2 && yArr.length >= 1) {
            for (int i = 0; i < xArr.length; i++) {
                for (int j = i + 1; j < xArr.length; j++) {
                    int line1 = xArr[i];
                    int line2 = xArr[j];

                    for (int k = 0; k < yArr.length; k++) {
                        int line3 = yArr[k];

                        boolean[] check = new boolean[arr.length];
                        for (int t = 0; t < arr.length; t++) {
                            if (arr[t][0] == line1 || arr[t][0] == line2 || arr[t][1] == line3) {
                                check[t] = true;
                            }
                        }

                        if (allChecked(check)) {
                            return 1;
                        }
                    }
                }
            }
        }

        // 3. x 1개 y 2개
        if (xArr.length >= 1 && yArr.length >= 2) {
            for (int i = 0; i < yArr.length; i++) {
                for (int j = i + 1; j < yArr.length; j++) {
                    int line1 = yArr[i];
                    int line2 = yArr[j];

                    for (int k = 0; k < xArr.length; k++) {
                        int line3 = xArr[k];

                        boolean[] check = new boolean[arr.length];
                        for (int t = 0; t < arr.length; t++) {
                            if (arr[t][1] == line1 || arr[t][1] == line2 || arr[t][0] == line3) {
                                check[t] = true;
                            }
                        }

                        if (allChecked(check)) {
                            return 1;
                        }
                    }
                }
            }
        }

        // 4. x 0개 y 3개
        if (yArr.length >= 3) {
            for (int i = 0; i < yArr.length; i++) {
                for (int j = i + 1; j < yArr.length; j++) {
                    for (int k = j + 1; k < yArr.length; k++) {
                        int line1 = yArr[i];
                        int line2 = yArr[j];
                        int line3 = yArr[k];

                        boolean[] check = new boolean[arr.length];
                        for (int t = 0; t < arr.length; t++) {
                            if (arr[t][1] == line1 || arr[t][1] == line2 || arr[t][1] == line3) {
                                check[t] = true;
                            }
                        }

                        if (allChecked(check)) {
                            return 1;
                        }
                    }
                }
            }
        }

        return 0;
    }

    public static boolean allChecked(boolean[] check) {
        for (boolean c : check) {
            if (!c) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Set<Integer> xs = new HashSet<>();
        Set<Integer> ys = new HashSet<>();
        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            xs.add(x);
            ys.add(y);
            arr[i] = new int[]{x, y};
        }

        int[] xArr = new int[xs.size()];

        int xIdx = 0;
        for (int x : xs) {
            xArr[xIdx] = x;
            xIdx++;
        }

        int[] yArr = new int[ys.size()];

        int yIdx = 0;
        for (int y : ys) {
            yArr[yIdx] = y;
            yIdx++;
        }

        System.out.println(calc(arr, xArr, yArr));
    }
}