package Threading;
public class ThreeThreadTest {
     public static void main (String[] args) {
        new ThreadingDemo("Jamaica").start();
        new ThreadingDemo("Fiji").start();
        new ThreadingDemo("Bora Bora").start();
    }
}
