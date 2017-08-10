import java.io.*;
import java.util.Scanner;
public class FileHandling {
    public static void main(String[] args) {
        File f = new File("average.txt");
        try{
            Scanner input = new Scanner(f);
            while(input.hasNext()){
                System.out.println(input.next());
            }
            input.close();
        }
        catch(FileNotFoundException e){
            System.err.println("File not found Exiting");
            System.exit(1);
        }
    }
}
