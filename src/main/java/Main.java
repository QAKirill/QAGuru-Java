public class Main {

    public static void main(String[] args) {

        byte varByte = 0;  // [-128, 127]
        short varShort = 0; // [-32.768, 32.767]
        int varInt = 0; // [-2.147.483.648, 2.147.483.647]
        long varLong = 0; // [-9.223.372.036.854.775.808, 9.223.372.036.854.775.807]

        int a = Integer.MAX_VALUE;
        int b = 10;
        double c = 32.4;

        System.out.println("Переполнение: " + (a + 1));
        System.out.println("Переполнение +2: " + (a + 2));

        a = 12000;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));

        System.out.println("=============");

        if (a > b) {
            System.out.println("a + b = " + (a + b));
        } else {
            System.out.println("a - b = " + (a - b));
        }

        if (a > 0 && b < 100) {
            System.out.println("a * b = " + (a * b));
        }

        a = -6523;
        if (a > 0 || b < 100) {
            System.out.println("a / b = " + (a / b));
        }

        System.out.println("=============");

        System.out.println("b + c = " + (c + b));
        System.out.println("b - c = " + (b - c));
        System.out.println("b * c = " + (b * c));
        System.out.println("b / c = " + (b / c));
        System.out.println(3 + 4.2);
    }
}
