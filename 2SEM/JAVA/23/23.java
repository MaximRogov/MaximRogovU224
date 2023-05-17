import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int divisor1 = scanner.nextInt();
        int divisor2 = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % divisor1 == 0 || i % divisor2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
