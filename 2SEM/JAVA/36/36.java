import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] code = new int[4];
        for (int i = 0; i < code.length; i++) {
            code[i] = random.nextInt(10);
        }
        int attempts = 0;
        while (attempts < 20) {
            System.out.print("Ведите 4 числа: ");
            int[] guess = new int[4];
            for (int i = 0; i < guess.length; i++) {
                guess[i] = scanner.nextInt();
            }
            int matches = 0;
            for (int i = 0; i < code.length; i++) {
                for (int j = 0; j < guess.length; j++) {
                    if (code[i] == guess[j]) {
                        matches++;
                    }
                }
            }
            if (matches == 4) {
                System.out.println("код взломан за " + (attempts + 1) + " попыток.");
                return;
            } else {
                System.out.println("Совпадения: " + matches);
            }
            attempts++;
        }
        System.out.println("код: " + code[0] + code[1] + code[2] + code[3]);
    }
}
