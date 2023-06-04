import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        System.out.print("Введите число сдвига: ");
        int shift = scanner.nextInt();
        System.out.print("Введите направление (1 - зашифровать, -1 - расшифровать): ");
        int direction = scanner.nextInt();
        String output = caesarCipher(input, shift * direction);
        System.out.println("Результат: " + output);
    }

    public static String caesarCipher(String input, int shift) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                c = (char) (((c - base + shift) % 26 + 26) % 26 + base);
            }
            output.append(c);
        }
        return output.toString();
    }
}
