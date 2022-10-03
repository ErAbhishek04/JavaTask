import java.util.Scanner;

public class ValidTri {
    public static void main(String[] args) {
        System.out.println("Enter Angle values " );
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c= sc.nextInt();

        if (a+b+c==180 && a>0 && b>0 && c>0){
            System.out.println("The triangle is valid");

        }else{

            System.out.println("The triangle is Invalid!!!");
        }
    }
}
