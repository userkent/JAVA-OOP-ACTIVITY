
package activity15;

import java.util.Scanner;

public class Activity15 {
    public static void main(String [] args){
        
        Scanner scan = new Scanner (System.in);
        ShapeParent objCircle = new CircleChild();
        
        double radius = 0;
        boolean isEnable = true;
        
        while (isEnable){
            System.out.print("Enter radius:");
            radius = scan.nextDouble();
            if(radius >= 0){
                objCircle.setRadius(radius);
                isEnable = false;
            }else{
                System.out.println("Invalid! Please enter again");
            }
        }
        System.out.println("The diameter of the radius " + objCircle.getRadius() + " is " + objCircle.computeDiameter());
    }
}
