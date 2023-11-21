public class logicalOperation {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;

        boolean result = isTrue(x, y);

        System.out.println("Logical result І (x && y) = " + result);
    }

    public static boolean isTrue(boolean x, boolean y) {
        return x && y;
    }
}