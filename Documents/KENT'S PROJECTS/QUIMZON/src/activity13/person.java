
package activity13;

public class person {
      private int age = 0;
    
    
    public void setAge(int age){
        this.age = age;
    }
    
    public int getAge(){
        return age;
    }
    public void checker(){
        if(age< 18){
            System.out.println("MINOR");
        }else{
            System.out.println("ADULT");
        }
    }
}
