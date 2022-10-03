import java.util.Scanner;

public class Vote {

    public static void main(String[] args) {
        System.out.println("Enter the age of candidate");
        Scanner sc= new Scanner(System.in);
        int age =sc.nextInt();

        if (age>18){
            System.out.println("The candidate is eligible to vote");



        }
        else {
            System.out.println("The candidate is ineligible to vote");
        }
    }
}
