package PolymorphismShape;
public class Test {
    public static void main(String []args){
        Shape s1[] = new Shape[2];
        Circle c1 = new Circle(5,"Red");
        Cube c2 = new Cube(10,"Green");
        s1[0] = c1;
        s1[1] = c2;
        for(Shape s : s1){
            System.out.println(s.getClass());
            if(s instanceof Circle){
                System.out.println("Circle 1:");
                System.out.println("Color: "+s.getColor());
                System.out.println("Area: "+s.getArea());
            }
            else if(s instanceof Cube){
                System.out.println("Cube 1:");
                System.out.println("Color: "+s.getColor());
                System.out.println("Area: "+s.getArea());
                 System.out.println("Volume: "+((Cube)s).getVolume());
            }
        }
    }
}
