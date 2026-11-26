
package activity15;


public class ShapeParent {
    private double radius;
    private double diameter;
    
    public void setRadius(double radius){
      this.radius = radius;
}
    public double getRadius (){
        return radius;
    }
    public  double computeDiameter(){
        diameter = radius * 2;
        return diameter;
    
} 

}

