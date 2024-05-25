public class Main {
    public static void main(String[] args) {
        double a = 9.2;
        double b = 1.3;
        double ft = 30.48;
        int mile = 160934;

        double ftResult = a * ft;
        double mileResult = b * mile;

        System.out.print(a + "ft" + " ");
        System.out.print("=" + " ");
        System.out.printf("%.1f", ftResult);
        System.out.printf("cm\n");

        System.out.print(b + "mi" + " ");
        System.out.print("=" + " ");
        System.out.printf("%.1f", mileResult);
        System.out.printf("cm");
    }
}