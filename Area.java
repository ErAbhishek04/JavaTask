import java.util.Scanner;

public class Area {
    public void Circle(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius");
        double a = 3.142 ;
        int num2 = sc.nextInt();
        double res = a* num2 * num2;
        System.out.println(res);
    }
    public void Square(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side length");

        int a = sc.nextInt();
        double res = a* a;
        System.out.println(res);
    }
    public void Right(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  length");

        int a = sc.nextInt();
        System.out.println("Enter Breadth");
        int b = sc.nextInt();
        double res = 0.5 *  a* b;
        System.out.println(res);
    }

    public static void main(String[] args) {
        Area a = new Area();
        System.out.println("For area of circle");
        a.Circle();
        System.out.println("For area of Square");
        a.Square();
        System.out.println("For Area of Right angle triangle");
        a.Right();

    }
}
