import java.util.*;

/*
6개 중에 2 / 2 / 2 나누고
최대 최소의 차이 구하기
*/


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[6];

        int total = 0;
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        // System.out.println(total);

        int res = Integer.MAX_VALUE;
        for (int i = 0; i < 6; i++) {
            for (int j = i+1; j < 6; j++) {
                // 1팀 정해졌음
                // 1팀 / 2팀 합 = 토탈
                int t1 = arr[i];
                int t2 = arr[j];
                // System.out.println("============================");
                // System.out.println("i : " + i + " j : " + j);
                // System.out.println("============================");
                int team1Sum = t1 + t2;

                //1팀 정해졌음
                for (int k = 0; k < 6; k++) {
                    for (int l = k + 1; l < 6; l++) {
                        if (k != i && l != j && k != j && l != i) {
                            int t3 = arr[k];
                            int t4 = arr[l];

                            // System.out.println("k : " + k + " l : " + l);


                            int team2Sum = t3 + t4;
                            int team3Sum = total - team1Sum - team2Sum;

                            // System.out.println("team1Sum : " + team1Sum + " team2Sum : " + team2Sum + " team3Sum : " + team3Sum);
                            int max = Math.max(team1Sum, Math.max(team2Sum, team3Sum));
                            int min = Math.min(team1Sum, Math.min(team2Sum, team3Sum));

                            // System.out.println("max : " + max + " min : " + min);

                            res = Math.min(res, Math.abs(max - min));

                        }
                    }
                }
            }
        }

        System.out.println(res);
    }
}