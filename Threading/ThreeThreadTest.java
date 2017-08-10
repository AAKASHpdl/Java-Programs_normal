package Threading;
public class ThreeThreadTest {
     public static void main (String[] args) {
        ThreadingDemo t1 = new ThreadingDemo("Jamaica");
        t1.start();
        ThreadingDemo t2 = new ThreadingDemo("Fiji");
        t2.start();
        ThreadingDemo t3 = new ThreadingDemo("Bora Bora");
        t3.start();
    }
}
