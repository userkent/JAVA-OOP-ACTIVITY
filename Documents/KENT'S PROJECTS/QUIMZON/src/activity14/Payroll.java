
package activity14;


public class Payroll {
    
    private double hoursWorked;
    private double ratePerHour;
    private double grossSalary;
    
    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

     public void setHoursWorked(double hoursWorked){
        this.hoursWorked = hoursWorked;
    }
    
     public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    } 
     
    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }
    
    public double getGrossSalary() {
        return grossSalary; 
    }
    
    public void computeGrossSalary(){
        grossSalary = hoursWorked * ratePerHour;
    }
     
}
    
