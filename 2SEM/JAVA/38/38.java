import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = scanner.nextLine();
        String[] words = text.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            char firstLetter = word.charAt(0);
            String restOfWord = word.substring(1);
            result.append(restOfWord).append(firstLetter).append("ауч ");
        }
        System.out.println(result.toString().trim());
    }
}
