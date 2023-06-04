import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String num1 = scan.nextLine();
        int num1_int = Integer.parseInt(num1.trim());
        int num2 = scan.nextInt() - 1;
        int summ = 0;
        String[] nums = num1.split("");
        for(int i = 0; i < nums.length; i++){
            num2++;
            int n = Integer.parseInt(nums[i].trim ());
            summ += Math.pow(n,num2);

        }
        if(summ % num1_int == 0){

            System.out.println(true);

        } else {
            System.out.println(false);


        }



    }
}
