package AbstractBike;
public abstract class Bike {
    public void Run(){
        System.out.println("Bike runs on road with two wheels!");
    }
    public void Gear(){
        System.out.println("All bike has gears!");
    }
    public abstract void CC(int CC);
}
