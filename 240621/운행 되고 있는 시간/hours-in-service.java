import java.util.*;

class Time {
    int start;
    int end;

    public Time(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Time[] arr = new Time[N];

        for (int i = 0; i < N; i++) {
            arr[i] = new Time(sc.nextInt(), sc.nextInt());
        }

        int res = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) { //제외시킬 시간
            int[] time = new int[1001];
            int tmp = 0;
            for (int j = 0; j < N; j++) {
                if (j != i) {
                    int start = arr[j].start;
                    int end = arr[j].end;

                    for (int k = start; k < end; k++) {
                        if (time[k] == 0) {
                            time[k]++;
                        }
                    }
                }
            }
            for (int m = 0; m < 1001; m++) {
                if (time[m] == 1) {
                    tmp++;
                }
            }
            res = Math.max(res, tmp);
        }

        System.out.println(res);
    }
}