import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter your string to reverse");
        String a = S.next();
        StringBuilder sb = new StringBuilder(a);
        System.out.println("Your reversed String is:");
        System.out.println(sb.reverse());
    }
}
