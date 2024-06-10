import java.util.*;

class Student implements Comparable<Student>{
    int height;
    int weight;
    int num;

    public Student(int height, int weight, int num) {
        this.height = height;
        this.weight = weight;
        this.num = num;
    }

    public int compareTo(Student student) {
        if (this.height != student.height) {
            return this.height - student.height;
        }
        return student.weight - this.weight;
    }

}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Student[] arr = new Student[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Student(sc.nextInt(), sc.nextInt(), i+1);
        }

        Arrays.sort(arr);

        for (Student s : arr) {
            System.out.print(s.height + " " + s.weight + " " + s.num);
            System.out.println();
        }
    }
}