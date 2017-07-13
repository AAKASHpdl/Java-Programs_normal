package animalSystem;
public abstract class Animal {
    public void eat(){
        System.out.println("all animals eat");
    }
    public void sleep(int hours){
        System.out.println("It sleeps for "+hours+" hours");
    }
    public abstract void makeNoise();
}
