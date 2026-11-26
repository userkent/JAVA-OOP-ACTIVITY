
package Acitivity9;

import java.util.Scanner;
public class Activity9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          
         int num1 = 1;
       while(num1 !=0){
       System.out.print("Input number: ");
       num1 = input.nextInt();
       if(num1==0){
           System.out.println("babyeee");
           break;
       }
    
         if(num1%2==0){
            System.out.println("The number " + num1 + " is EVEN");
        }else{
            System.out.println("The number " + num1 + " is ODD");
        }
         
         if(num1 >=0)
               System.out.println("The number " + num1 + " is Positive");
        
         else if(num1 <=0)
        {
               System.out.println("The number " + num1 + " is Negative");        
        }
       
    }
}
}