package inheritanceShape;
public class Test{
    public static void main(String[] args){
        Cylinder c1=new Cylinder(5,"Green",10);
        System.out.println("The color is "+c1.getColor());
        c1.getArea();
        c1.getVolume();
    }
}
