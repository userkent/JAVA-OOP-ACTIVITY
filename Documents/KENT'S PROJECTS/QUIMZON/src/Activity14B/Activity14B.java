package Activity14B;

import Activity14B.Salary;
import java.util.Scanner;

public class Activity14B {
    public static void main(String[] args) {
        
          Salary objSalary = new Salary();
   Scanner scan = new Scanner(System.in);
   
   double rate = 0.00;
   double hours = 0.00;
   
   System.out.print("Enter hours worked: ");
   hours = scan.nextDouble();
   
   System.out.print("Enter rate per hour: ");
   rate = scan.nextDouble();
   
    objSalary.setRatePerHour(rate);
        System.out.println("Rate Per Hour: " + objSalary.getRatePerHour());
        
    objSalary.setHoursWorked(hours);
    System.out.println("Hours Worked: " + objSalary.getHoursWorked());
   
    objSalary.computeGrossSalary();
       
    
}
}