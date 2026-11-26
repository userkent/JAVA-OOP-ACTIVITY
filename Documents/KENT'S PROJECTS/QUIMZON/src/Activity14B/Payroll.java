
package Activity14B;

import java.text.DecimalFormat;
public class Payroll {
    DecimalFormat df = new DecimalFormat("0,000.00");
    private double hoursWorked;
    private double ratePerHour;
    private double grossSalary;
    
    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

     public void setHoursWorked(double hoursWorked){
        this.hoursWorked = hoursWorked;
    }
     
    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }
    
    public void computeGrossSalary(){
        System.out.println(grossSalary = hoursWorked * ratePerHour);
    }
     
}
    
