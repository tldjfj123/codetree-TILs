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
        // 1. 키가 더 큰 학생이 앞에 와야 함
        if (this.height != student.height) {
            return student.height - this.height; // 키가 큰 순서대로 정렬
        }
        // 2. 키가 동일하다면 몸무게가 더 큰 학생이 앞에 와야 함
        if (this.weight != student.weight) {
            return student.weight - this.weight; // 몸무게가 큰 순서대로 정렬
        }
        // 3. 키와 몸무게가 동일하다면 번호가 작은 학생이 앞에 와야 함
        return this.idx - student.idx; // 번호가 작은 순서대로 정렬
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