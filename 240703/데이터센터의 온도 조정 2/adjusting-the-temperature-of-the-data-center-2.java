import java.util.*;

/*
A < Ta : C
Ta < A < Tb : G
Tb < A : H
*/

class Temp {
    int start;
    int end;

    public Temp(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return start + " " + end;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc. nextInt(); // 장비 갯수
        int C = sc. nextInt(); // 장비 작업량 1
        int G = sc. nextInt(); // 장비 작업량 2
        int H = sc. nextInt(); // 장비 작업량 3

        Temp[] arr = new Temp[N];

        int min = 1000;
        int max = 1;

        for (int i = 0; i < N; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            min = Math.min(start, min);
            max = Math.max(end, max);

            arr[i] = new Temp(start, end);
        }

        int res = 0;
        for (int i = min; i <= max; i++) {
            int tmp = 0;
            for (int j = 0; j < N; j++) {
                int s = arr[j].start;
                int e = arr[j].end;

                if (i <s) {
                    tmp += C;
                } else if (s <= i && i <= e) {
                    tmp += G;
                } else {
                    tmp += H;
                }
            }
            res = Math.max(tmp, res);
        }

        System.out.println(res);
    }
}