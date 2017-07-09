package inheritance_area_volume;
import java.util.Random;
public class TestObject{
    public static void main(String[] args){
        Random R = new Random();
        Cylinder C = new Cylinder();
        double Circle[]= new double[10];
        double Cylinder[]=new double[10];
        for(int i=0;i<10;i++){
           Circle[i]=R.nextInt(15)+1;
           Cylinder[i]=R.nextInt(15)+1;
        }
        for(int i=0;i<10;i++){
           C.setRadius(Circle[i]);
           switch(i){
               case 1:C.setColor("blue");break;
               case 2:C.setColor("green");break;
               case 3:C.setColor("purple");break;
               case 4:C.setColor("yellow");break;
               case 5:C.setColor("orange");break;
               case 6:C.setColor("voilet");break;
               case 7:C.setColor("black");break;
               case 8:C.setColor("crimson");break;
               case 9:C.setColor("white");break;
            }
           System.out.println(C.toString());
           System.out.println("Area of circle "+(i+1)+" : "+C.getArea());
           C.setHeight(Cylinder[i]);
           System.out.println("Volume of Cylinder "+(i+1)+" : "+C.getVolume());
           System.out.println();
        }
    }
}