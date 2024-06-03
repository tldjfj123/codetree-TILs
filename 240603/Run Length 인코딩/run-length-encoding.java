import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = sc.next().toCharArray();

        if (arr.length == 1) {
            String res = "";
            res += arr[0];
            res += String.valueOf(1);


            System.out.println(res.length());
            System.out.print(res);
        } else {
            String res = "";
            
            char std = arr[0];
            int cnt = 1;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] != std) {
                    res += std;
                    res += String.valueOf(cnt);
                    std = arr[i];
                    cnt = 1;
                } else {
                    cnt++;
                }
            }
            res += std;
            res += String.valueOf(cnt);

            System.out.println(res.length());
            System.out.print(res);
        }
    }
}