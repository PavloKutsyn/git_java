public class Main {

    // The `main` method is the entry point of the Java application.
    public static void main(String[] args) {
        // A String variable `message` is declared and initialized with "Hello, World!".
        String message = "Hello, World!";

        // The `printMessage` method is called with `message` as the argument.
        printMessage(message);
    }

    // The `printMessage` method is defined as a public static method.
    // It takes a String argument and prints it to the console.
    // This method can be reused in other classes if needed
    public static void printMessage(String message) {

        System.out.println(message);
    }
}