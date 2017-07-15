package PolymorphismShape;
public abstract class TwoDimensionalShape extends Shape {
    public TwoDimensionalShape(String color){
        super(color);
    }
    @Override
    public abstract double getArea();
}
