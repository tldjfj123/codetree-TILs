import java.util.*;

class Info {
    String name;
    String code;
    String region;

    public Info(String name, String code, String region) {
        this.name = name;
        this.code = code;
        this.region = region;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Info[] arr = new Info[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String code = sc.next();
            String region = sc.next();

            arr[i] = new Info(name, code, region);
        }

        // name 기준으로 역순 정렬
        Arrays.sort(arr, Comparator.comparing((Info info) -> info.name).reversed());

        System.out.println("name " + arr[0].name);
        System.out.println("addr " + arr[0].code);
        System.out.println("city " + arr[0].region);
    }
}