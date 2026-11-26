
package activity6;

import java.util.Scanner;

public class activity6 {
    public static void main(String[] args) {
        Scanner code = new Scanner(System.in);
        
        int age = 0;
        
        System.out.print("Enter age: ");
                age = code.nextInt();
                
        if(age >=0 && age<=17){
            System.out.println("GO HOME AND SLEEP");
        }else if (age >=18 && age <=59){
            System.out.println("PARTY PARTY");
        }else if(age >=60 && age <=130){
            System.out.println("Drink Kape");
        }else {
            System.out.println("already dead.");
        }
        
    }
    
}
