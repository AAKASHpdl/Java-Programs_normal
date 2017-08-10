package Threading;
import java.util.Random;
public class ThreadingDemo extends Thread{
    Random R = new Random();
    public ThreadingDemo(String threadName){
        super(threadName);
    }
    @Override
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println(i+" "+getName());
            try {
                long t = R.nextInt(1000);
                sleep(t);
            } 
            catch(InterruptedException e){}
        }
        System.out.println("DONE! "+getName());
    }
}
