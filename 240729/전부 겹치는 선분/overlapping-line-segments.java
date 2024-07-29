import java.util.*;

class Line implements Comparable<Line> {
    int x1;
    int x2;

    public Line(int x1, int x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    @Override
    public String toString() {
        return this.x1 + " " + this.x2; 
    }

    @Override
    public int compareTo(Line l) {
        return this.x1 - l.x1;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Line[] arr = new Line[n];

        for (int i = 0; i < n; i++) {
            int s1 = sc.nextInt();
            int s2 = sc.nextInt();

            arr[i] = new Line(s1, s2);
        }

        Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));

        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length-1; i++) {
            Line left = arr[i];
            Line right = arr[i+1];

            // System.out.println(start + " " + end);

            if (left.x1 <= right.x1 && right.x2 <= left.x2) {
                start = right.x1;
                end = right.x2;
            } else if (left.x2 <= right.x1) {
                start = left.x2;
                end = right.x1;
            }
        }

        // System.out.println(start + " " + end);

        if (start != 0 || end != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }




    }
}