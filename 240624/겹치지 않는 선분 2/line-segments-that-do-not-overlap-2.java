import java.util.*;

class Point implements Comparable<Point>{
    int x1;
    int x2;

    public Point(int x1, int x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    @Override
    public int compareTo(Point p) {
        return this.x1 - p.x1;
    }

    @Override
    public String toString() {
        return x1 + " " + x2;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Point[] arr = new Point[N];

        for (int i = 0; i < N; i++) {
            arr[i] = new Point(sc.nextInt(), sc.nextInt());
        }

        //시작점 내림차순 정렬
        Arrays.sort(arr);

        // System.out.println(Arrays.toString(arr));
        int res = N;

        for (int i = 0; i < arr.length; i++) {
            boolean isBack = false;
            int iStart = arr[i].x1;
            int iEnd = arr[i].x2;

            if (iStart > iEnd) {
                isBack = true;
            }
            
            for (int j = i+1; j < arr.length; j++) {
                // System.out.println(arr[i] + " " + arr[j]);
                int jStart = arr[j].x1;
                int jEnd = arr[j].x2;
                if (isBack) { 
                    if (jStart > jEnd) { // 둘다 왼쪽방향
                        if ((iEnd <= jEnd && jStart <= iStart) || (jEnd <= iEnd && iStart <= jStart)) {
                            res -= 2;
                        }
                    } else { // 한놈은 왼쪽 한놈은 오른쪽
                        if (iEnd <= jStart && jStart <= iStart) {
                            res -= 2;
                        }   
                    }
                } else {
                    if (jStart > jEnd) { // 한놈은 오른쪽 한놈은 왼쪽
                        if (iStart <= jEnd && jEnd <= iEnd) {
                            res -= 2;
                        }
                    } else { // 둘다 오른쪽
                        if ((iStart <= jStart && jEnd <= iEnd) || (jStart <= iStart && iEnd <= jEnd)) {
                            res -= 2;
                        }
                    }

                }
            }
        }
        
        if (res > 0) {
            System.out.println(res);
        } else {
            System.out.println(0);
        }
    }
}