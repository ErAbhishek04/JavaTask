import java.util.Scanner;

public class Salary {

    public static int SalCalc(int salary){

        double DA,TA,HRA,Bonus ;
        double PF;
        DA = 0.15* salary ;
        TA = 0.10*salary;
        HRA =0.20*salary;
       PF = 0.12 *salary;
       if (salary>20000){
           Bonus = 0.10*salary;
       }else {
           Bonus = 0.20*salary;
       }


        double pf = PF;
        int  gross = (int) (salary + DA + TA + HRA + Bonus -pf);
       return gross ;

    }


    public static void main(String[] args) {
        System.out.println("Enter The Salary");
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        System.out.println("  Your gross salary is : "+SalCalc(salary));

    }
}
