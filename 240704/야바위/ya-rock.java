import java.util.*;

class Case {
    int a;
    int b;
    int c;

    public Case (int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String toString() {
        return a + " " + b + " " + c;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Case[] cases = new Case[N];

        for (int i = 0; i < N; i++) {
            cases[i] = new Case(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        
        int res = 0;
        for (int i = 0; i < N; i++) {
            //초기 셋팅 
            int cnt = 0;
            int[] arr = new int[N];
            arr[i] = 1;

            for (Case t : cases) {
                int a = t.a-1;
                int b = t.b-1;
                int c = t.c-1;

                //야바위 진행
                int tmp = arr[a];
                arr[a] = arr[b];
                arr[b] = tmp;

                //오픈
                if (arr[c] == 1) {
                    cnt++;
                }
            }
            res = Math.max(cnt, res);
        }


        System.out.println(res);
    }
}