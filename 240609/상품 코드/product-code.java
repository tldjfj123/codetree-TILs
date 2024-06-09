import java.util.*;

class Product {
    String name = "codetree";
    String code = "50";

    public Product() {

    }

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        String code = sc.next();

        Product prod1 = new Product();
        Product prod2 = new Product(name, code);

        System.out.println("product " + prod1.code + " is " + prod1.name);
        System.out.println("product " + prod2.code + " is " + prod2.name);

    }
}