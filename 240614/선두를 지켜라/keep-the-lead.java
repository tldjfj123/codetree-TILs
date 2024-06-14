import java.util.*;

class Info {
    int v;
    int t;

    public Info(int v, int t) {
        this.v = v;
        this.t = t;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        Info[] aInfo = new Info[N];
        Info[] bInfo = new Info[M];
        
        int size = 0;
        for (int i = 0; i < N; i++) {
            aInfo[i] = new Info(sc.nextInt(), sc.nextInt());
            size += aInfo[i].t;

        }

        for (int i = 0; i < M; i++) {
            bInfo[i] = new Info(sc.nextInt(), sc.nextInt());
        }

        int[] statusA = new int[size+1];
        int[] statusB = new int[size+1];
        
        int aIdx = 1;
        for (Info a : aInfo) {
            for (int i = aIdx; i < aIdx + a.t; i++) {
                statusA[i] = statusA[i-1] + a.v; 
            }
            aIdx += a.t;
        }

        int bIdx = 1;
        for (Info b : bInfo) {
            for (int i = bIdx; i < bIdx + b.t; i++) {
                statusB[i] = statusB[i-1] + b.v; 
            }
            bIdx += b.t;
        }

        String curr = ""; // 1 : A가 앞섬, 2 : B가 앞섬
        int cnt = 0;
        for (int i = 1; i <= size; i++) {
            if (statusA[i] > statusB[i]) {
                if (curr.equals("")) {
                    curr = "A";
                } else if (curr.equals("B")) {
                    curr = "A";
                    cnt++;
                }
            } else if (statusA[i] < statusB[i]) {
                if (curr.equals("")) {
                    curr = "B";
                } else if (curr.equals("A")) {
                    curr = "B";
                    cnt++;
                }
            }
        }

        System.out.print(cnt);



    }
}