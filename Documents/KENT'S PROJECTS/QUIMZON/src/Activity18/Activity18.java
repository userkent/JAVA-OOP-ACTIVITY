/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity18;

import java.util.*;

public class Activity18 {
    public static void main (String[] args){
        
    Scanner scan = new Scanner (System.in);
    LoanCompute objLoan = new LoanCompute ();
    double loanAmount = 0;
    boolean isValid = true;
    
       
        while(isValid){
            try{
        System.out.println("Enter Loan Amount: ");
        loanAmount = scan.nextDouble();
      
        if(loanAmount < 5000 || loanAmount > 10000000){
            System.out.println("Invalid Amount! Please input again!");
        }else{
            objLoan.setLoanAmount(loanAmount);
            isValid = false;
        }
        }catch(Exception e){
                System.out.println("error at :" + e);
                scan.next();
                }
        }    
        
        isValid = false;     
        objLoan.setLoanAmount(loanAmount);
        objLoan.getLoanAmount();
        objLoan.computeInterest();
        objLoan.computeTotalPayableAmount();
        objLoan.computeMonthlyAmortization();
       
        
             
        }   
         
}