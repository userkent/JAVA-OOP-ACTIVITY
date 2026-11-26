/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity18;

/**
 *
 * @author Aiza Mae
 */
public abstract class AbstractLoan {
    
   double loanAmount;
   private double interest = 8.00;
   private double totalPayableAmount;
   private double monthAmortization;
   
   public abstract void setLoanAmount(double loanAmount);
   
   public abstract double getLoanAmount();
   
   public abstract void computeInterest();
   
   public abstract void computeTotalPayableAmount();
   
   public abstract void computeMonthlyAmortization();
   
  
}
