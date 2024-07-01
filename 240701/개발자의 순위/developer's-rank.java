import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt(); // 경기 수
        int N = sc.nextInt(); // 개발자 순위

        List<int[]> res = new ArrayList<int[]>();

        for (int t = 0; t < K; t++) {
            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            if (t == 0) {
                for (int i = 0; i < N; i++) {
                    for (int j = i+1; j < N; j++) {
                        res.add(new int[]{arr[i], arr[j]});
                    }
                }
            } else {
                List<int[]> tmp = new ArrayList<int[]>();

                for (int i = 0; i < N; i++) {
                    for (int j = i+1; j < N; j++) {
                        int stdS = arr[i];
                        int stdE = arr[j];
                        boolean found = false;

                        for (int k = 0; k < res.size(); k++) {
                            if (res.get(k)[0] == stdS && res.get(k)[1] == stdE) {
                                found = true;
                            }
                        }

                        if (found) {
                            tmp.add(new int[]{stdS, stdE});
                        }
                    }
                }

                res = tmp;
            }
            
        }

        System.out.println(res.size());


    }
}