package Activity17B;

import java.util.*;
import Activity17B.SubClass;

public class Activity18 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    SubClass objBata = new SubClass();
    
        int age;
        String name;
        boolean isValid = true;
                
            System.out.println("Enter Name: ");
            name = sc.nextLine();
           
            while(isValid){    
                try{ 
                    System.out.println("Enter Age: ");
                    age = sc.nextInt();
                    System.out.println("\n==========================\n");
              
                isValid = false;
                objBata.setName(name);
                objBata.setAge(age);
                objBata.ageChecker();
                
                }catch(Exception e) {
                System.out.println("Error at : " + e);
                sc.next();
            
            }
        }
        
    }
            
}
