import java.util.*;

class Range {
    int start;
    int end;

    public Range(int start, int end) {
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

        int N = sc.nextInt();

        Range[] arr = new Range[N];

        for (int i = 0; i < N; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            arr[i] = new Range(start, end);
        }

        for (int i = 1; i <= 50000; i++) {
            boolean isOk = true;
            int num = i;

            for (int j = 0; j < N; j++) {
                num *= 2;

                if (num < arr[j].start || num > arr[j].end) {
                    isOk = false;
                    break;
                }
            }

            if (isOk) {
                System.out.println(i);
                break;
            }
        }




    }
}