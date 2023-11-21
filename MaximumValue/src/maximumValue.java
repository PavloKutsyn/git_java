public class maximumValue {
    public static void main(String[] args) {
        int x = 10;
        int y = 3;
        int max = findMax(x, y);
        System.out.println("The maximum value is " + max);
        }
        public static int findMax(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }
}
