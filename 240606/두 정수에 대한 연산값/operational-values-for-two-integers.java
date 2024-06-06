import java.util.*;

class IntWrapper {
    int value;

    public IntWrapper(int value) {
        this.value = value;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IntWrapper a = new IntWrapper(sc.nextInt());
        IntWrapper b = new IntWrapper(sc.nextInt());

        calc(a, b);

        System.out.print(a.value + " " + b.value);
    }

    static void calc(IntWrapper x, IntWrapper y) {
        if (x.value > y.value) {
            x.value += 25;
            y.value *= 2;
        } else {
            y.value += 25;
            x.value *= 2;
        }
    }
}