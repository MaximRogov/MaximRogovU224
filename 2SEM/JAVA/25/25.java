import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        String m = number.nextLine();
        String[] num = m.split(" ");
        int summ = 0;
        int y = 0;
        int y1 = 0;
        for(int i = 0; i < num.length; i++){
            y = Integer.parseInt(num[0]);
            y1 = Integer.parseInt(num[1]);
        }
        for(int x1 = y; x1 <= y1; x1++){
            ArrayList<String> al = new ArrayList();
            ArrayList<String> al2 = new ArrayList();
            for(int i = 2; i < num.length; i++){
                al2.add(num[i]);
                int x = Integer.parseInt(num[i].trim());
                if(x1 % x == 0){
                    String str = "" + x;
                    al.add(str);
                }

            }
            if(al.equals(al2)){
                summ += x1;
            }
        }
        System.out.println(summ);

    }
}
