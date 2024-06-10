import java.util.*;

class Person {
    String name;
    int height;
    double weight;

    public Person(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person[] arr = new Person[5];

        for (int i = 0; i <5; i++) {
            arr[i] = new Person(sc.next(), sc.nextInt(), sc.nextDouble());
        }

        Arrays.sort(arr, new Comparator<Person>() {  
            @Override
            public int compare(Person a, Person b) { // 키 기준 내림차순 정렬합니다.
                return a.name.compareTo(b.name);
            }
        });

        // 이름순으로 정렬한 결과를 출력합니다.
        System.out.println("name");
        for (int i = 0; i < 5; i++){
            System.out.print(arr[i].name + " ");
            System.out.print(arr[i].height + " ");
            System.out.printf("%.1f\n", arr[i].weight);
        }

        System.out.println();

         // custom comparator를 활용한 정렬
        Arrays.sort(arr, new Comparator<Person>() {  
            @Override
            public int compare(Person a, Person b) { // 키 기준 내림차순 정렬합니다.
                return b.height - a.height;
            }
        });

        // 키순으로 정렬한 결과를 출력합니다.
        System.out.println("height");
        for (int i = 0; i < 5; i++){
            System.out.print(arr[i].name + " ");
            System.out.print(arr[i].height + " ");
            System.out.printf("%.1f\n", arr[i].weight);
        }

    }
}