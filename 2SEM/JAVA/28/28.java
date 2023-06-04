import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        while (true) {
            int square1 = i * i;
            int square2 = (i + 1) * (i + 1);
            int diff = square2 - square1;
            if (diff == n) {
                System.out.println(square2 + "-"+square1);
                break;
            }
            i++;
        }
    }
}
