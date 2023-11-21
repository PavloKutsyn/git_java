public class integerVariables {

    public static void main(String[] args) {
        int x = 10;
        int y = 3;

        System.out.println("Sum: " + add(x, y));
        System.out.println("Difference: " + subtract(x, y));
        System.out.println("Product: " + multiply(x, y));
        System.out.println("Quotient: " + divide(x, y));
        System.out.println("Remainder: " + modulus(x, y));
    }

    public static int add(int x, int y) {

        return x + y;
    }

    public static int subtract(int x, int y) {

        return x - y;
    }

    public static int multiply(int x, int y) {

        return x * y;
    }

    public static double divide(int x, int y) {

        return (double) x / y;
    }

    public static int modulus(int x, int y) {

        return x % y;
    }
}