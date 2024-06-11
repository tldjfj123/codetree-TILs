import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int[] dayOfMonth = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int day1Cnt = d1;
        int day2Cnt = d2;

        for (int i = 0; i < m1; i++) {
            day1Cnt += dayOfMonth[i];
        }

        for (int i = 0; i < m2; i++) {
            day2Cnt += dayOfMonth[i];
        }

        int diff = day2Cnt - day1Cnt;

        String[] date = new String[] {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        if (diff >= 0) {
            System.out.print(date[diff % 7]);
        } else {
            System.out.print(date[date.length - (int)Math.abs((diff%7))]);
        }
        
    }
}