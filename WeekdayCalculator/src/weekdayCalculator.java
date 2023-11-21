public class weekdayCalculator {
    public static void main(String[] args) {
        int x = 110;
        String dayOfWeek = getDayOfWeek(x);
        System.out.println(dayOfWeek);
    }

    public static String getDayOfWeek(int number) {
        int dayIndex = number % 7;
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (dayIndex >= 0 && dayIndex < days.length) {
            return days[dayIndex];
        } else {
            return "Wrong number";
        }
    }
}
