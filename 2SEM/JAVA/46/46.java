import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static HashMap<Character, Integer> romanToArabicMap = new HashMap<>();

    static {
        romanToArabicMap.put('I', 1);
        romanToArabicMap.put('V', 5);
        romanToArabicMap.put('X', 10);
        romanToArabicMap.put('L', 50);
        romanToArabicMap.put('C', 100);
        romanToArabicMap.put('D', 500);
        romanToArabicMap.put('M', 1000);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Римское число от 1 до 9999:");

        String romanNumber = scanner.nextLine();
        int arabicNumber = romanToArabic(romanNumber);

        if (1 < arabicNumber && arabicNumber < 10000) {
            System.out.println("Арабское число: " + arabicNumber);
        } else {
            System.out.println("Введите число в диапазоне от 1 до 9999.");
        }
    }

    private static int romanToArabic(String romanNumber) {
        int arabicValue = 0;
        int previousValue = 0;
        for (int i = romanNumber.length() - 1; i >= 0; i--) {
            char romanChar = romanNumber.charAt(i);
            int currentValue = romanToArabicMap.get(romanChar);

            if (currentValue < previousValue) {
                arabicValue -= currentValue;
            } else {
                arabicValue += currentValue;
            }
            previousValue = currentValue;
        }
        return arabicValue;
    }
}
