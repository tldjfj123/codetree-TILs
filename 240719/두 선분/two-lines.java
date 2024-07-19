import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        int x4 = sc.nextInt();

        /*
        선분이 교차하는 경우
        1. 포함되는 경우
        2. 겹치는 경우
        */
        boolean check =false;
        if (x3 <= x2) {
            check = true;
        } 

        if (check) {
            System.out.println("intersecting");
        } else {
            System.out.println("nonintersecting");        }
    }
}