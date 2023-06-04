import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int result = getNextPermutation(number);
        if (result == -1) {
            System.out.println("-1");
        } else {
            System.out.println("" + result);
        }
    }

    public static int getNextPermutation(int number) {
        char[] digits = Integer.toString(number).toCharArray();
        int n = digits.length;
        int i = n - 2;
        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }
        if (i < 0) {
            return -1;
        }
        int j = n - 1;
        while (digits[j] <= digits[i]) {
            j--;
        }
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;
        Arrays.sort(digits, i + 1, n);
        int result = Integer.parseInt(new String(digits));
        return result;
    }
}
