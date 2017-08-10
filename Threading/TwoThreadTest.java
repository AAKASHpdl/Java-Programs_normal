package Threading;
public class TwoThreadTest {
    public static void main (String[] args) {
        ThreadingDemo t1 = new ThreadingDemo("Jamaica");
        t1.start();
        ThreadingDemo t2 = new ThreadingDemo("Fiji");
        t2.start();
    }
}
