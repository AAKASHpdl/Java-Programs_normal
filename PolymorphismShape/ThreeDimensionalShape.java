package PolymorphismShape;
public abstract class ThreeDimensionalShape extends Shape {
    public ThreeDimensionalShape(String color){
        super(color);
    }
    @Override
    public abstract double getArea();
    public abstract double getVolume();
}
