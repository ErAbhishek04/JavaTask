import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        System.out.println("Working Months and Days");
        Scanner sc = new Scanner(System.in);
        int m =sc.nextInt();
        int  month ;
       month = m / 30;
        m = m % 30;
        System.out.println("No. of months :"+month);
        System.out.println("No. of days :" + m);
    }
}
