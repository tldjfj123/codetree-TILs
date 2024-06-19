import java.util.*;

public class Main {
    static final int N = 19;
    static int[][] arr;
    static int resX, resY;
    static int whoWin = 0;
    static int type = 0;

    public static boolean inRange(int x, int y) {
        if (0 <= x && x < N && 0 <= y && y < N) {
            return true;
        }
        return false;
    }
    
    public static boolean calc(int x, int y) {

        int rowCnt1 = 0;
        int rowCnt2 = 0;
        // 가로
        for (int i = y; i < y+5; i++) {
            if(inRange(x, i)) {
                if (arr[x][i] == 1) {
                    rowCnt1++;
                    rowCnt2 = 0;

                    if (rowCnt1 >= 5) {
                        resX = x;
                        resY = i;
                        whoWin = 1;
                        type = 1;
                        return true;
                    }
                } else if (arr[x][i] == 2) {
                    rowCnt2++;
                    rowCnt1 = 0;

                    if (rowCnt2 >= 5) {
                        resX = x;
                        resY = i;
                        whoWin = 2;
                        type = 1;
                        return true;
                    }
                } else {
                    rowCnt1 = 0;
                    rowCnt2 = 0;
                }
            }
        }

        int columnCnt1 = 0;
        int columnCnt2 = 0;
        // 세로
        for (int i = x; i < x+5; i++) {
            if(inRange(i, y)) {
                if (arr[i][y] == 1) {
                    columnCnt1++;
                    columnCnt2 = 0;

                    if (columnCnt1 >= 5) {
                        resX = i;
                        resY = y;
                        whoWin = 1;
                        type = 2;
                        return true;
                    }
                } else if (arr[x][i] == 2) {
                    columnCnt2++;
                    columnCnt1 = 0;

                    if (columnCnt2 >= 5) {
                        resX = i;
                        resY = y;
                        whoWin = 2;
                        type = 2;
                        return true;
                    }
                } else {
                    columnCnt1 = 0;
                    columnCnt2 = 0;
                }
            }
        }


        int rightCnt1 = 0;
        int rightCnt2 = 0;
        // 대각(우측)
        for (int i = 0; i < 5; i++) {
            int nx = x + i;
            int ny = y + i;

            if(inRange(nx, ny)) {
                if (arr[nx][ny] == 1) {
                    rightCnt1++;
                    rightCnt2 = 0;

                    if (rightCnt1 >= 5) {
                        resX = nx;
                        resY = ny;
                        whoWin = 1;
                        type = 3;
                        return true;
                    }
                } else if (arr[nx][ny] == 2) {
                    rightCnt2++;
                    rightCnt1 = 0;

                    if (rightCnt2 >= 5) {
                        resX = nx;
                        resY = ny;
                        whoWin = 2;
                        type = 3;
                        return true;
                    }
                } else {
                    rightCnt1 = 0;
                    rightCnt2 = 0;
                }    
            }
        }
        

        int leftCnt1 = 0;
        int leftCnt2 = 0;
        // 대각(좌)
        for (int i = 0; i < 5; i++) {
            int nx = x + i;
            int ny = y - i;

            if(inRange(nx, ny)) {
                if (arr[nx][ny] == 1) {
                    leftCnt1++;
                    leftCnt2 = 0;

                    if (leftCnt1 >= 5) {
                        resX = nx;
                        resY = ny;
                        whoWin = 1;
                        type = 4;
                        return true;
                    }
                } else if (arr[nx][ny] == 2) {
                    leftCnt2++;
                    leftCnt1 = 0;

                    if (leftCnt2 >= 5) {
                        resX = nx;
                        resY = ny;
                        whoWin = 2;
                        type = 4;
                        return true;
                    }
                } else {
                    leftCnt1 = 0;
                    leftCnt2 = 0;
                }
            }
        }

        return false;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        boolean flag = false;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(calc(i, j)) {
                    // System.out.println(i + " " + j);
                    flag = calc(i, j);
                    break;
                }
            }
            if (flag) {
                break;
            }
        }

        // System.out.println(resX + " " + resY + " " + whoWin);
        System.out.println(whoWin);

        if (whoWin != 0) {
            if (type == 1) {
            System.out.println((resX+1) + " " + (resY-1));
            } else if (type == 2) {
                System.out.println((resX-1) + " " + (resY+1));
            } else if (type == 3) {
                System.out.println((resX-1) + " " + (resY-1));
            } else {
                System.out.println((resX-1) + " " + (resY+3));
            }

        }
        
    }
}