import java.util.*;
class Rsp {
    int left;
    int right;

    public Rsp(int left, int right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "left = " + left + " right = " + right;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cnt1 = 0;
        int cnt2 = 0;

        List<Rsp> arr = new ArrayList<Rsp>();

        for (int i = 0; i < n; i++) {
            int left = sc.nextInt();
            int right = sc.nextInt();

            if (left != right) {
                arr.add(new Rsp(left, right));
            }
        }

        // System.out.println(arr);

        //1. 가 바 보
        int res1 = 0;

        for (Rsp a : arr) {
            if (a.left == 1 && a.right == 3 || a.left == 2 && a.right == 3 || a.left == 3 && a.right == 1) {
                res1++;
            }
        }
        
        // 2. 가 보 바
        int res2 = 0;

        for (Rsp a : arr) {
            if (a.left == 1 && a.right == 2 || a.left == 2 && a.right == 3 || a.left == 3 && a.right == 1) {
                res2++;
            }
        }


        // 3. 바 가 보
        int res3 = 0;

        for (Rsp a : arr) {
            if (a.left == 1 && a.right == 2 || a.left == 2 && a.right == 3 || a.left == 3 && a.right == 1) {
                res3++;
            }
        }

        // 4. 바 보 가
        int res4 = 0;

        for (Rsp a : arr) {
            if (a.left == 1 && a.right == 3 || a.left == 2 && a.right == 1 || a.left == 3 && a.right == 2) {
                res4++;
            }
        }


        // 5. 보 가 바
        int res5 = 0;

        for (Rsp a : arr) {
            if (a.left == 1 && a.right == 3 || a.left == 2 && a.right == 1 || a.left == 3 && a.right == 1) {
                res5++;
            }
        }

        // 6. 보 바 가
        int res6 = 0;

        for (Rsp a : arr) {
            if (a.left == 1 && a.right == 2 || a.left == 2 && a.right == 3 || a.left == 3 && a.right == 1) {
                res6++;
            }
        }

        System.out.println(Math.max(res1, Math.max(res2, Math.max(res3, Math.max(res4, Math.max(res5, res6))))));
    }
}