package inheritanceShape;
public class Cylinder extends Circle {
    private double height;
    public Cylinder(){
    }
    public Cylinder(double height){
        this.height=height;
    }
    public Cylinder(double radius,String color,double height){
        super(radius,color);
        this.height=height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double getRadius(){
        return(super.getRadius());
    }
    @Override
    public void getArea(){
        super.getArea();
    }
    @Override
    public String getColor(){
        return(super.getColor());
    }
    public void getVolume(){
        double volume=3.14*super.getRadius()*super.getRadius()*height;
        System.out.println("The volume is "+volume);
    }
}
