
package Activity17B;

public class SubClass extends AbstractClass {
    private int age;
    private String name;
    
    @Override
    public void setName(String name){
        this.name = name;
    }
    @Override
    public String getName(){
    return name;
    }
    
    @Override
    public void setAge(int age){
        this.age = age;
        System.out.println("Student name is: \n" + name);
    }
    
    @Override
    public int getAge(){
        return age;
    }
    
    @Override
    public void ageChecker(){
        if(age <=0){
                System.out.println("Invalid age.! Please input again.");
        }else if(age< 18){
            System.out.println("he/she is 'MINOR'");
        }else{
            System.out.println("he/she is 'ADULT'");
        }
    }

}
