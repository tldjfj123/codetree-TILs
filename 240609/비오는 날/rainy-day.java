import java.util.*;

class Data {
    String date;
    String day;
    String weather;

    public Data(String date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Data> arr = new ArrayList<Data>();

        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();

            if (weather.equals("Rain")) {
                arr.add(new Data(date, day, weather));
            }
        }


        arr.sort(Comparator.comparing(data -> data.date));

        System.out.print(arr.get(0).date + " " + arr.get(0).day + " " + arr.get(0).weather);


    }
}