import java.util.*;

class Student implements Comparable<Student>{
    String name;
    int score1;
    int score2;
    int score3;

    public Student(String name, int score1, int score2, int score3) {
        this.name = name;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }

    @Override
    public int compareTo(Student Student) {
        return (this.score1 + this.score2 + this.score3) - (Student.score1 + Student.score2 + Student.score3);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Student[] arr = new Student[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score1 = sc.nextInt();
            int score2 = sc.nextInt();
            int score3 = sc.nextInt();

            arr[i] = new Student(name, score1, score2, score3);
        }

        Arrays.sort(arr);

        for (Student a : arr) {
            System.out.println(a.name + " " + a.score1 + " " + a.score2 + " " + a.score3);
        }
    }
}