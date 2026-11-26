package Activity17;


public class GradeSubClass extends GradeAbstractClass {

    // Private variable for encapsulation
    private double grade;

    // Setter method to assign the grade
    @Override
    public void setGrade(double grade) {
        this.grade = grade;
    }

    // Getter method to return the grade
    @Override
    public double getGrade() {
        return grade;
    }

    // Method to evaluate the grade
    @Override
    public String evaluateGrade() {

        if (grade == 1.0) {
            return "Excellent";
        }
        else if (grade > 1.0 && grade <= 3.0) {
            return "Passed";
        }
        else {
            return "Failed";
        }
    }
}

