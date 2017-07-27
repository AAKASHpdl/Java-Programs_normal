package FileHandlingDemo;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Average {
    private static Scanner input;
    public static void openFile(){
        try{
            input = new Scanner(new File("average.txt"));
        }
        catch(FileNotFoundException f){
            System.err.println("File not found. Exiting");
            System.exit(1);
        }
    }
    public static void closeFile(){
        if(input!= null){
            input.close();
        }
    }
    public static void main(String[] args) {
        openFile();
        String split;
        int temp=0;
        int sum=0;
        int count=0;
        double average;
        while(input.hasNext()){
            split = (input.nextLine().split("\t"))[1];
            temp = new Integer(split);
            sum += temp;
            count++;
            System.out.println(temp);
        }
        System.out.println("The sum is: "+sum);
        average= sum/count;
        System.out.println("The average is: "+average);
        closeFile();
    }
}
