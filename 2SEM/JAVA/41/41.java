import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println(secondsToFormattedTime(62));
        System.out.println(secondsToFormattedTime(3662));

    }

    public static String secondsToFormattedTime(int seconds) {
        int minutes = seconds / 60;
        seconds %= 60;
        int hours = minutes / 60;
        minutes %= 60;
        int days = hours / 24;
        hours %= 24;
        int weeks = days / 7;
        days %= 7;
        int months = weeks / 4;
        weeks %= 4;
        int years = months / 12;
        months %= 12;

        List<String> timeFormat = new ArrayList<String>();

        if (years > 0) {
            timeFormat.add(years + " " + pluralize(years, "год", "года", "лет"));
        }
        if (months > 0) {
            timeFormat.add(months + " " + pluralize(months, "месяц", "месяца", "месяцев"));
        }
        if (weeks > 0) {
            timeFormat.add(weeks + " " + pluralize(weeks, "неделя", "недели", "недель"));
        }
        if (days > 0) {
            timeFormat.add(days + " " + pluralize(days, "день", "дня", "дней"));
        }
        if (hours > 0) {
            timeFormat.add(hours + " " + pluralize(hours, "час", "часа", "часов"));
        }
        if (minutes > 0) {
            timeFormat.add(minutes + " " + pluralize(minutes, "минута", "минуты", "минут"));
        }
        if (seconds > 0) {
            timeFormat.add(seconds + " " + pluralize(seconds, "секунда", "секунды", "секунд"));
        }

        if (timeFormat.isEmpty()) {
            return "0 секунд";
        } else if (timeFormat.size() == 1) {
            return timeFormat.get(0);
        } else {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < timeFormat.size() - 1; i++) {
                result.append(timeFormat.get(i)).append(", ");
            }
            result.append("и ").append(timeFormat.get(timeFormat.size() - 1));
            return result.toString();
        }
    }

    public static String pluralize(int number, String single, String few, String many) {
        int lastDigit = number % 10;
        int lastTwoDigits = number % 100;

        if (lastDigit == 1 && lastTwoDigits != 11) {
            return single;
        } else if (lastDigit >= 2 && lastDigit <= 4 && !(lastTwoDigits >= 12 && lastTwoDigits <= 14)) {
            return few;
        } else {
            return many;
        }
    }
}
