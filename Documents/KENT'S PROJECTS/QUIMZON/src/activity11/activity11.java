
package activity11;
import java.util.Scanner;

public class activity11 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     SubAge objAct = new SubAge();
       int age = 0;
       String name ;
       
       boolean isEnabled = true;
       while(isEnabled){
           System.out.println("Student Name: ");
           name = sc.nextLine();
           System.out.println("Enter Age: ");
           age = sc.nextInt();
           if(age <=0 || age > 130){
               System.out.println("Invalid age.! Please input again.");
           }else{
                 objAct.setAge(age);
                 System.out.println("Students Name is: " + name);
                 System.out.println("The age is : " + objAct.getAge());
                 objAct.checker();
                 isEnabled = false;
                }
            }
        }
    }
