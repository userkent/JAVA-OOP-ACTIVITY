
package activity13;


public class student extends person{
   private int age = 0;
    
    
   @Override
    public void setAge(int age){
        this.age = age;
    }
    @Override
    public int getAge(){
        return age;
    }

    @Override
    public void checker(){
        if(age> 18){
            System.out.println("ADULT");
        }else{
            System.out.println("MINOR");
        }
    }
}
