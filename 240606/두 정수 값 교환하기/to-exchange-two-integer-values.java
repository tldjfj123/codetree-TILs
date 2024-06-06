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

        IntWrapper a =  new IntWrapper(sc.nextInt());
        IntWrapper b =  new IntWrapper(sc.nextInt());

        swap(a, b);

        System.out.print(a.value + " " + b.value);
    }

    static void swap(IntWrapper n, IntWrapper m) {
        int tmp = n.value;
        n.value = m.value;
        m.value = tmp;
    }
}