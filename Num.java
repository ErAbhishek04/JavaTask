import java.util.Scanner;

public class Num {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1>num2){
                 System.out.println("The Larger Number is :" + num1);

        }
        else {

            System.out.println("The larger number is :" +num2);
        }
    }
}
