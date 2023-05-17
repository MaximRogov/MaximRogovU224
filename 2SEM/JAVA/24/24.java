import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("m:");
        int m = scanner.nextInt();
        System.out.print("n:");
        int n = scanner.nextInt();
        System.out.print("Количество делитeлей:");
        int numDiv = scanner.nextInt();
        int[] divisors = new int[numDiv];
        for (int i = 0; i < numDiv; i++) {
            divisors[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = m; i <= n; i++) {
            for (int j = 0; j < numDiv; j++) {
                if (i % divisors[j] == 0) {
                    sum += i;
                    break;
                }
            }
        }
        System.out.println("Сумма:"+ sum);
    }
}
