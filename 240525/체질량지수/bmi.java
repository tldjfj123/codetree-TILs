import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt(); //키
        int w = sc.nextInt(); //몸무게

        int bmi = (int)((10000 * w) / (double)(h * h));

        System.out.println(bmi);
        if (bmi >= 25) {
            System.out.println("Obesity");
        } 




    }
}