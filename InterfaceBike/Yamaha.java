package InterfaceBike;
public class Yamaha implements Bike, Vehicle {
    @Override
    public void cc(){
        System.out.println("It has 200 CC");
    }
    @Override
    public void gear(){
        System.out.println("It has 6 gears step");
    }
    @Override
    public void run(){
        System.out.println("It runs on ground");
    }
    @Override
    public void color(){
        System.out.println("It has red color");
    }
}
