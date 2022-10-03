import java.util.Scanner;

public class Arith {

    public void Add(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1= sc.nextInt();
        int num2 = sc.nextInt();
        int res = num1+num2;
        System.out.println(res);
    }
    public void Sub(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1= sc.nextInt();
        int num2 = sc.nextInt();
        int res = num1-num2;
        System.out.println(res);
    }
    public void Div(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1= sc.nextInt();
        int num2 = sc.nextInt();
        int res = num1/num2;
        System.out.println(res);
    }
    public void Mul(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1= sc.nextInt();
        int num2 = sc.nextInt();
        int res = num1*num2;
        System.out.println(res);
    }
    public void Rem(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1= sc.nextInt();
        int num2 = sc.nextInt();
        int res = num1%num2;
        System.out.println(res);
    }


    public static void main(String[] args) {
        Arith a = new Arith();
        a.Add();
        a.Sub();
        a.Mul();
        a.Div();
        a.Rem();

    }
}
