public class Main {
    public static String sum(String num1, String num2) {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int sum = n1 + n2;
        return Integer.toString(sum);
    }
    public static void main(String[] args) {
        System.out.println(sum("12","12"));
    }
}
