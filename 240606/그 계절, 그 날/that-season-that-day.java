import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        printWeather(y, m, d);


    }

    static void printWeather(int y, int m, int d) {
        if (!checkDate(y, m, d)) {
            System.out.print(-1);
        } else {
            System.out.print(checkWeather(m));
        }
    }

    static boolean isLeapYear(int y) {
        if (y % 4 == 0 || (y % 4 == 0 && y % 100 == 0 && y % 400 == 0)) {
            return true;
        }
        return false;
    }

    static String checkWeather(int m) {
        if (3 <= m && m <= 5) {
            return "Spring";
        } else if (6 <= m && m <= 8) {
            return "Summer";
        } else if (9 <= m && m <= 11) {
            return "Fall";
        } else {
            return "Winter";
        }
    }

    static boolean checkDate(int y, int m, int d) {
        if (isLeapYear(y)) {
            if (m > 12 || m < 1) {
                return false;
            }
            if (m == 2) {
                if (1 <= d && d <= 29) {
                    return true;
                }
                return false;
            } else if (m == 4 || m == 6 || m == 9 || m == 11) {
                if (1 <= d && d <= 30) {
                    return true;
                }
                return false;
            } else {
                if (1 <= d && d <= 31) {
                    return true;
                }
                return false;
            }
            
        } else {
            if (m > 12 || m < 1) {
                return false;
            }
            if (m == 2) {
                if (1 <= d && d <= 28) {
                    return true;
                }
                return false;
            } else if (m == 4 || m == 6 || m == 9 || m == 11) {
                if (1 <= d && d <= 30) {
                    return true;
                }
                return false;
            } else {
                if (1 <= d && d <= 31) {
                    return true;
                }
                return false;
            }
        }
    }
}