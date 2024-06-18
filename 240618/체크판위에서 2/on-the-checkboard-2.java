import java.util.*;

class Point{
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();

        char[][] arr = new char[R][C];
        boolean[][] visited = new boolean[R][C];

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                arr[i][j] = sc.next().charAt(0);
            }
        }

        if (arr[0][0] != arr[R-1][C-1]) {
            int x = 0;
            int y = 0;
            char std = arr[x][y];
            boolean checked = false;

            List<Point> arr1 = new ArrayList<Point>() ;

            for (int i = x+1; i < R-1; i++) {
                for (int j = y+1; j < C-1; j++) {
                    if (arr[i][j] != std) {
                        arr1.add(new Point(i, j));
                        visited[i][j] = true;
                        checked = true;
                    }
                }
            }

            if (checked) {
                if (std == 'W') {
                    std = 'B';
                } else {
                    std = 'W';
                }
                
            }

            System.out.println(arr1);

            List<Point> arr2 = new ArrayList<Point>() ;

            int res = 0;
            for (Point p : arr1) {
                for (int i = p.x+1; i < R-1; i++) {
                    for (int j = p.y+1; j < C-1; j++) {
                        if (arr[i][j] != std) {
                            res++;
                        }
                    }
                }
            }

            System.out.println(arr2);
            System.out.println(res);
        } else {
            System.out.print(0);
        }


            
        
    }
}