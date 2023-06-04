public class Main {
    public static void main(String[] args) {
        System.out.println(fusc(0) + "\n" + fusc(1) + "\n"
                + fusc(11)+ "\n" + fusc(3) + "\n" + fusc(9999));
    }
    public static int fusc(int n) {
        int a = 0;
        int b = 1;
        int temp;
        if(n == 0) {
            return 0;
        }
        while(n >= 2) {
            if(n % 2 == 0) {
                n /= 2;
            } else {
                temp = a;
                a += b;
                b = temp;
                n--;
            }
        }
        return a + b;

    }
}
