import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа через пробел:");
        String input = scanner.nextLine();
        int[] numbers = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();

        int maxIndex = findMaxIndex(numbers);
        int[] leftArray = Arrays.copyOfRange(numbers, 0, maxIndex);
        int[] rightArray = Arrays.copyOfRange(numbers, maxIndex + 1, numbers.length);

        System.out.println("Максимальное значение: " + numbers[maxIndex]);
        System.out.println("Числа слева от максимума: " + Arrays.toString(leftArray));
        System.out.println("Числа справа от максимума: " + Arrays.toString(rightArray));
    }

    private static int findMaxIndex(int[] numbers) {
        int maxIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
