import java.util.Scanner;

public class Marriage
{
    public static void main(String[] args) {
        System.out.println("Enter 1 = If Married ");
        System.out.println("Enter 2= If male unmarried ");
        System.out.println("Enter 3 = If Female unmarried");

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        if (i == 1) {

            System.out.println("Driver is insured");

        } else {
            System.out.println("Enter Age:");
            int age = sc.nextInt();
            if (i == 2 && age > 30) {

                System.out.println("Driver is insured");

            } else if (i == 3 && age > 25) {
                System.out.println("Driver is insured");
            }
           else {
                System.out.println("Driver is not insured");
            }

        }
    }
}
