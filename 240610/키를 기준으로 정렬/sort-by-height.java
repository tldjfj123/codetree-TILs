import java.util.*;

class Info implements Comparable<Info>{
    String name;
    int height;
    int weight;

    public Info(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Info info) {
        return this.height - info.height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Info[] arr = new Info[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();

            arr[i] = new Info(name, height, weight);
        }

        Arrays.sort(arr);

        for (Info a : arr) {
            System.out.println(a.name + " " + a.height + " " + a.weight);
        }



    }
}