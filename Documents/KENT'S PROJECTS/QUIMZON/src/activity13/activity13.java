package activity13;

import activity13.student;
import java.util.Scanner;

public class activity13 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     student objAct = new student();
     
        int age = 0;
        System.out.println("Enter Age: ");
        age = sc.nextInt();

        objAct.setAge(age);
        System.out.println("The age is : " + objAct.getAge());
        
        objAct.checker();
            }
        }
