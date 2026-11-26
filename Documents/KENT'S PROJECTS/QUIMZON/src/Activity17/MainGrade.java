package Activity17;


import java.util.Scanner;

public class MainGrade {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GradeSubClass student = new GradeSubClass();

        double grade;

        while (true) {

            System.out.print("Enter Grade: ");

            if (input.hasNextDouble()) {

                grade = input.nextDouble();

                if (grade >= 1.0 && grade <= 5.0) {
                    break;
                }
                else {
                    System.out.println("Invalid Grade! Please try again.");
                }
            }
            else {
                System.out.println("Invalid input! Please enter a number.");
                input.next();
            }
        }

        student.setGrade(grade);

        System.out.println("Grade: " + student.getGrade());
        System.out.println("Remarks: " + student.evaluateGrade());
        
        
        input.close();
    }
}
