
package activity5;

import java.util.Scanner;
import java.text.DecimalFormat;

public class activity5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat point = new DecimalFormat("#,###.00");
        
        String name = "";
        int age = 0;
        float grade = 0.0f;
        double kwarta = 0.0d;
        boolean isTaken = true;
        
        System.out.print("Enter name: "+ name);
        name = scan.nextLine();
        
        System.out.print("Enter age: "+ age);
        age = scan.nextInt();
        
        System.out.print("Enter Grade: "+ grade);
        grade = scan.nextFloat();
        
        System.out.print("Enter cash: "+ kwarta);
        kwarta = scan.nextDouble();
        
        System.out.print("Enter Status (true or false):");
        isTaken = scan.nextBoolean();
        
        
        System.out.println("\n\nYour name is "+ name + " ! and You are " + age + " Years old.");
        System.out.println("Your grade is " + grade + ". Your cash is " + point.format(kwarta));
        System.out.println("Are u single? " + isTaken);
        
    
        
        
    }
    
}
