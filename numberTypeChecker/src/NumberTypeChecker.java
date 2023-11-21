import java.util.Scanner;

public class NumberTypeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        String result = checkNumber(number);
        System.out.println(result);

        scanner.close();
    }

    public static String checkNumber(int number) {
        if (number > 0) {
            return "The number is positive";
        } else if (number < 0) {
            return "The number is negative";
        } else {
            return "The number is 02";
        }
    }
}