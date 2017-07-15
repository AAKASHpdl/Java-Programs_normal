package PolymorphismShape;
public class Cube extends ThreeDimensionalShape {
    private double length;
    public Cube(double length,String color){
        super(color);
        this.length=length;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double getArea(){
        return(6*length*length);
    }
    @Override
    public double getVolume(){
        return(length*length*length);
    }
}
