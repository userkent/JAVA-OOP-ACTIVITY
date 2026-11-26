
package activity14;


public class Salary extends Payroll {
    
    private double hoursWorked;
    private double ratePerHour;
    private double grossSalary;
    
    @Override
    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }
    @Override
    public void setHoursWorked(double hoursWorked){
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double getHoursWorked() {
        return hoursWorked;
    }
    @Override
    public double getRatePerHour() {
        return ratePerHour;
    }
    @Override
    public double getGrossSalary() {
        return grossSalary; 
    }
    @Override
    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }
    @Override
    public void computeGrossSalary(){
        grossSalary = hoursWorked * ratePerHour;
    }
   
}