import java.util.*;

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
}

public class Main {
    public static boolean checkY(int x1, int y1, int x2, int y2) {
        if (x1 == x2) {
            return true; // 선분이 수직선인 경우
        }
        
        return false; // 그 외의 경우
    }

    public static boolean checkX(int x1, int y1, int x2, int y2) {
        if (y1 == y2) {
            return true; // 선분이 수직선인 경우
        }
        
        return false; // 그 외의 경우
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Point[] arr = new Point[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Point(sc.nextInt(), sc.nextInt());
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) { // 점 3개 골랐음
                    Point p1 = arr[i];
                    Point p2 = arr[j];
                    Point p3 = arr[k];

                    if (checkX(p1.x, p1.y,  p2.x, p2.y)) {
                        if (checkY(p2.x, p2.y , p3.x, p3.y)) {
                            res = Math.abs((p1.x * p2.y + p2.x * p3.y + p3.x * p1.y) - (p2.x * p1.y + p3.x * p2.y + p1.x * p3.y));
                        }
                    } 
                    if (checkX(p2.x, p2.y,  p3.x, p3.y)) {
                        if (checkY(p3.x, p3.y, p1.x, p1.y)) {
                            res = Math.abs((p1.x * p2.y + p2.x * p3.y + p3.x * p1.y) - (p2.x * p1.y + p3.x * p2.y + p1.x * p3.y));
                        }
                    } 

                    if (checkX(p1.x, p1.y,  p3.x, p3.y)) {
                        if (checkY(p3.x, p3.y, p2.x, p2.y)) {
                            res = Math.abs((p1.x * p2.y + p2.x * p3.y + p3.x * p1.y) - (p2.x * p1.y + p3.x * p2.y + p1.x * p3.y));
                        }
                        
                    } 


                    
                }
            }
        }
        System.out.println(res);
        
    }
}