import java.util.*;

class Line implements Comparable<Line>{
    int start; 
    int end;

    public Line(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return start + " " + end;
    }

    @Override
    public int compareTo(Line line) {
        return this.start - line.start;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Line[] arr = new Line[n];

        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();

            arr[i] = new Line(s, e);
        }

        Arrays.sort(arr);

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    boolean[] check = new boolean[101];
                    boolean isOk = true;

                    for (int t = 0; t < n; t++) {
                        if (t != i && t != j && t != k) {
                            int s = arr[t].start;
                            int e = arr[t].end;

                            for (int m = s; m <= e; m++) {
                                if (!check[m]) {
                                    check[m] = true;
                                } else {
                                    isOk = false;
                                    break;
                                }
                            }
                            
                        }
                    }

                    if (isOk) {
                        cnt++;
                    }
                }
            }
        }

        System.out.println(cnt);


    }
}