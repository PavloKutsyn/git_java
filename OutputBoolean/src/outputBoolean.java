public class outputBoolean {
    public static void main(String[] args) {
        int x = 10;
        int y = 3;
        boolean isTrue = compare (x, y);
        System.out.println ("True: " + isTrue);
    }
    public static boolean compare (int x, int y) {
        return x > y;
    }
}
