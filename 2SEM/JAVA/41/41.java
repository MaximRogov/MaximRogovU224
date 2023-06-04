public class Main {
    public static void main(String[] args) {
        int seconds = 3662;
        String result = calculateTime(seconds);
        System.out.println(result);
    }

    public static String calculateTime(int seconds) {
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;

        String result = "";
        if (hours > 0) {
            result += hours + " час";
            if (hours > 1) {
                result += "а";
            }
            result += ", ";
        }
        if (minutes > 0) {
            result += minutes + " минут";
            if (minutes > 1) {
                result += "ы";
            }
            result += " и ";
        }
        result += remainingSeconds + " секунд";
        return result;
    }
}
