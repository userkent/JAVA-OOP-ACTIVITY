
package activity11;

public class SubAge {
    private int age = 0;
    private int name = 0;
    
    
    public void setAge(int age){
        this.age = age;
    }
    public void setName(int name){
        this.age = name;
    }
    public int getName(){
        return name;
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
