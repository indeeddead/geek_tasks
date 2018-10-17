package home_tasks1;

// Task 1
public class Main {
    // Task 2
    public static void main(String[] args) {
        byte bt = 23;
        short srt = 480;
        int ai = 2280;
        double db = 4.3;
        long lg = 459874;
        float flt = 4.83f;
        char cr = 'S';
        String string = "String";

        int a = -11;
        int b = 19;
        int c = 6;
        int d = 4;
        String hello = "Артём";

        System.out.println("Task 3: " + expressionRes(a, b, c, d));
        System.out.println("Task 4: " + sumInFrames(a, c));
        System.out.println("Task 5: " + numberPlus(d));
        System.out.println("Task 6: " + numberMin(a));
        Name(hello);
        Year();
    }

    // Task 3
    public static int expressionRes(int a, int b, int c, int d) {
        int x = 0;
        x = a * (b + (c / d));
        return x;
    }

    // Task 4
    public static boolean sumInFrames(int a, int c) {
        boolean blOk = true;
        boolean blNot = false;
        if (a + c >= 10 && a + c <= 20) {
            return blOk;
        } else {
            return blNot;
        }
    }

    // Task 5
    public static String numberPlus(int d) {
        if (d >= 0) {
            return "Число положительное";
        } else {
            return "Число отрицательное";
        }
    }

    // Task 6
    static boolean numberMin(int a) {
        boolean bool = false;
        boolean plus = true;
        if (a >= 0) {
            return bool;
        } else {
            return plus;
        }
    }

    // Task 7
    static void Name(String hello) {

        System.out.println("Task 7: Привет, " + hello + "!");
    }

    // Task 8
    static void Year() {
        int y = 100;
        if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
            System.out.println("Task 8: Високосный год");
        } else {
            System.out.println("Task 8: Не является високосным");
        }
    }
}