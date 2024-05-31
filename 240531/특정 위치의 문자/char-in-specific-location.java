import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[]{"L", "E", "B", "R", "O", "S"};
        String target = sc.next();

        String res = "None";

        for (int i = 0; i < arr.length; i++) {
            if (target.equals(arr[i])) {
                res = String.valueOf(i);
                break;
            }
        }
        System.out.print(res);


    }
}