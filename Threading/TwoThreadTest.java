package Threading;
public class TwoThreadTest {
    public static void main (String[] args) {
        new ThreadingDemo("Jamaica").start();
        new ThreadingDemo("Fiji").start();
    }
}
