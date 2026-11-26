
package Activity14B;


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
    public void computeGrossSalary(){
        System.out.println(grossSalary = hoursWorked * ratePerHour);
        
    }
   
}