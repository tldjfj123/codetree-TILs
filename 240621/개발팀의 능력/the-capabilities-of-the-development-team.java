import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        int res = -1;
        for (int i = 0; i < 5; i++) {
            // System.out.println("i : " + i);
            int team1 = arr[i]; // 깍두기 1명 정하기

            for (int j = 0; j < 5; j++) {
                for (int k = j+1; k < 5; k++) { //2명 정하기 (깍두기 제거 유의)
                    if (j != i && k != i) {
                        // System.out.println("j : " + j + " k : " + k);
                        int t1 = arr[j];
                        int t2 = arr[k];
                        
                        int team2 = t1 + t2; // 2명 1팀
                        int team3 = sum - team1 - team2; // 2명 2팀

                        if (team1 != team2 && team2 != team3) {
                            int max = Math.max(team1, Math.max(team2, team3));
                            int min = Math.min(team1, Math.min(team2, team3));

                            res = Math.min(res, Math.abs(max - min));
                        }
                    }
                }
            }
        }

        System.out.println(res);
    }
}