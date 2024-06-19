import java.util.*;

public class Main {
    public static boolean calc(int x, int y) {
        char[] arrX = String.valueOf(x).toCharArray();
        char[] arrY = String.valueOf(y).toCharArray();

        if (arrX.length == arrY.length) {
            for (int i = 0; i < arrX.length; i++) {
                if ((arrX[i] - '0') + (arrY[i] - '0') > 9) {
                    return false;
                }
            }
            return true;
        } else {
            int gap = (int)Math.abs(arrX.length - arrY.length);
            
            if (arrX.length > arrY.length) {
                for (int i = 0; i < arrX.length - gap; i++) {
                    if ((arrX[i + gap] - '0') + (arrY[i] - '0') > 9) {
                        return false;
                    }
                }
                return true;
            } else {
                for (int i = 0; i < arrY.length - gap; i++) {
                    if ((arrX[i] - '0') + (arrY[i + gap] - '0') > 9) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        /*
        덧셈하는 숫자의 자릿수의 최솟값 확인

        */
        int res = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                // System.out.println(arr[i] +  " " + arr[j]);
                if (calc(arr[i], arr[j])) {
                    // System.out.println(arr[i] +  " " + arr[j]);
                    int tmp = arr[i] + arr[j];
                    for (int k = j+1; k < arr.length; k++) {
                        if (calc(tmp, arr[k])) {
                            // System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                            res = Math.max(tmp + arr[k], res);
                        }
                        
                    }
                }
                
            }
        }

        System.out.println(res);
    }
}