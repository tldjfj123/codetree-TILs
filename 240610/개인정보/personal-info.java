import java.util.*;

class Person implements Comparable<Person>{
    String name;
    int height;
    double weight;

    public Person(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    
    @Override
    public int compareTo(Person person) {
        // 이름으로 비교
        int nameCompare = this.name.compareTo(person.name);
        if (nameCompare != 0) {
            return nameCompare;
        } else {
            // 이름이 같으면 키로 비교
            return person.height - this.height;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person[] people = new Person[5];

        // 입력 받기
        for (int i = 0; i < 5; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            double weight = sc.nextDouble();
            people[i] = new Person(name, height, weight);
        }

        // 이름순으로 정렬
        Arrays.sort(people);

        // 이름순으로 출력
        System.out.println("name");
        for (Person person : people) {
            System.out.printf("%s %d %.1f%n", person.name, person.height, person.weight);
        }

        // 키가 큰 순으로 정렬하여 출력
        Arrays.sort(people, Comparator.comparingInt((Person p) -> p.height).reversed());

        System.out.println();

        System.out.println("height");
        for (Person person : people) {
            System.out.printf("%s %d %.1f%n", person.name, person.height, person.weight);
        }
    }
}