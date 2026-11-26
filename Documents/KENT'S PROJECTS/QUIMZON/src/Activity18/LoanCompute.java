/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity18;

import java.text.DecimalFormat;

public class LoanCompute extends AbstractLoan{
    DecimalFormat df = new DecimalFormat("#0,000.00");
    private double LoanAmount;
    private double interest;
    private double totalPayableAmount;
    private double monthlyAmortization;
    
    @Override
    public void setLoanAmount(double loanAmount){
        this.loanAmount= loanAmount;
    }
    @Override
    public double getLoanAmount(){
        return loanAmount;
    }
    
    @Override
    public void computeInterest(){
        interest = loanAmount * 0.08;
        System.out.println("Total Interest is :" + df.format(interest));
        }
    
    @Override
    public void computeTotalPayableAmount(){
        totalPayableAmount = loanAmount + interest;
        System.out.println("Total total payable amount is :" + df.format(totalPayableAmount));
        
    }
    
    @Override
    public void computeMonthlyAmortization(){
        monthlyAmortization = totalPayableAmount / 12;
        System.out.println("Total total monthly amortization is :" + df.format(monthlyAmortization));
    }
    
   }