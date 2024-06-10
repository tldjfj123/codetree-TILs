import java.util.*;

class Dot implements Comparable<Dot>{
    int x;
    int y;
    int distance;
    int idx;

    public Dot(int x, int y, int idx) {
        this.x = x;
        this.y = y;
        this.idx = idx;
        this.distance = (int)(Math.abs(x) + Math.abs(y));    
    }

    @Override
    public int compareTo(Dot dot) {
        if (this.idx != dot.idx) {
            return this.distance - dot.distance;
        }

        return this.idx - dot.idx;
        
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Dot[] arr = new Dot[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Dot(sc.nextInt(), sc.nextInt(), i);
        }

        Arrays.sort(arr);

        for (Dot d : arr) {
            System.out.println(d.idx+1);
        }
    }
}