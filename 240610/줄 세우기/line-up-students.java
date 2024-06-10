import java.util.*;

class Student implements Comparable<Student>{
    int height;
    int weight;
    int idx;

    public Student(int height, int weight, int idx) {
        this.height = height;
        this.weight = weight;
        this.idx = idx;
    }

    @Override
    public int compareTo(Student student) {
        if (this.height == student.height) {
            return student.weight - this.weight;
        }

        if (this.weight == student.weight) {
            return student.idx - this.idx;
        }

        return student.height - this.height;
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

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].height + " " + arr[i].weight + " " + arr[i].idx);
        }

    }
}