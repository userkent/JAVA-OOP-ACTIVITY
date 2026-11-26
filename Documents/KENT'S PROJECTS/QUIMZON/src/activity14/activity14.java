package activity14;

import activity14.Salary;
import java.util.Scanner;

public class activity14 {

    public static void main(String[] args) {
         Salary objSalary = new Salary();
   Scanner scan = new Scanner(System.in);
   
   double rate = 0.00;
   double hours = 0.00;
   double gross = 0.00;
   
   System.out.print("Enter hours worked: ");
   hours = scan.nextDouble();
   
   System.out.print("Enter rate per hour: ");
   rate = scan.nextDouble();
   
   
    objSalary.setRatePerHour(rate);
        System.out.println(objSalary.getRatePerHour());
        
    objSalary.setHoursWorked(hours);
    System.out.println(objSalary.getHoursWorked());
   
    objSalary.setGrossSalary(gross);
        System.out.println(objSalary.getGrossSalary());
   
    
    objSalary.computeGrossSalary();
    }
}
