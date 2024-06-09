import java.util.*;

class s {
    String code;
    String point;
    int time;

    public s(String code, String point, int time) {
        this.code = code;
        this.point = point;
        this.time = time;
    }


}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String code = sc.next();
        String point = sc.next();
        int time = sc.nextInt();

        s res = new s(code, point, time);

        System.out.println("secret code : " + res.code);
        System.out.println("meeting point : " + res.point);
        System.out.println("time : " + res.time);
    }
}