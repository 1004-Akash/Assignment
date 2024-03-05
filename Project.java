import java.io.*;
import java.util.Scanner;
class Employee
{
    double  salary;
    double allowance;
    double deduction;
    double netpay;
    Employee(double salary,double allowance, double deduction)
    {
         this.salary=salary;
         this.allowance=allowance;
         this.deduction=deduction;
    }
    void net_pay()
    {
        netpay=salary+allowance-deduction;
        System.out.println("Netpay is"+netpay);
    }
    
}
public class Project {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double  salary;
        double allowance;
        double deduction; 
        System.out.println("Enter number of Employees");
        int N=sc.nextInt();
         
        for(int i=1;i<=N;i++)
        {
            System.out.println();
            System.out.println("Enter"+" "+i+"st Employee data");
        System.out.println("Enter Salary");
        salary=sc.nextDouble();
        System.out.println("Enter allowance");
        allowance=sc.nextDouble();
        System.out.println("Enter deduction");
        deduction=sc.nextDouble();
        Employee e=new Employee(salary,allowance,deduction);
            e.net_pay();
    }

    }
}
