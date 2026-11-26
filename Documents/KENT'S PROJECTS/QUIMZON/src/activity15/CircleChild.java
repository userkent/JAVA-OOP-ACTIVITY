
package activity15;


public class CircleChild extends ShapeParent {
    private double radius;
    private double diameter;
    
    @Override 
    public void setRadius(double radius){
      this.radius = radius;
    }

    @Override
    public double getRadius (){
        return radius;
    }
    
    @Override
    public  double computeDiameter(){
        diameter = radius * 2;
        return diameter;
    
} 

}

