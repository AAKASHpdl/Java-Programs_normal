package InterfaceDemo;
public class Dog implements Animal, DomesticAnimal {
    @Override
    public void eat(){
        System.out.println("Dog eats food");
    }
    @Override
    public void sleep(){
        System.out.println("Dog sleeps for 7 hours");
    }
    @Override
    public void makeNoise(){
        System.out.println("Dog barks!");
    }
    @Override
    public void shelterName(){
        System.out.println("Dog shelters in Canal");
    }
}
