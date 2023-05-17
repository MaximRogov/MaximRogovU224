
public class Main {
    public static void main(String[] args) {
        String input = "7891";
        System.out.println("Input: " + input);
        System.out.println("Result: " + numpadToPhone(input));
    }

    private static String numpadToPhone(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            switch (c) {
                case '7':
                    result.append('1');
                    break;
                case '8':
                    result.append('2');
                    break;
                case '9':
                    result.append('3');
                    break;
                case '4':
                    result.append('4');
                    break;
                case '5':
                    result.append('5');
                    break;
                case '6':
                    result.append('6');
                    break;
                case '1':
                    result.append('7');
                    break;
                case '2':
                    result.append('8');
                    break;
                case '3':
                    result.append('9');
                    break;
                default:
                    result.append('\u0000');
            }
        }
        return result.toString();
    }
}


