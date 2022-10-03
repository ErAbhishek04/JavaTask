import java.util.Scanner;

public class Price {
    public static void main(String[] args) {
        System.out.println("Enter Quantity");
        Scanner sc = new Scanner(System.in);
        int quantity= sc.nextInt();
        System.out.println("Enter Price");
        double price=sc.nextInt();
        if (quantity >=10){
           price= 0.10 * price ;
            System.out.println("The total Discounted Price is  " + price);


        }
        else{
            System.out.println("No Discount");

        }
    }
}
