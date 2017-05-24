package Random_Multiplication;
import java.util.Scanner;
import java.util.Random;
public class Multiplication {
    public static void main(String [] args){
        Multiplication M=new Multiplication();
        M.randomValue();
        M.correctPercentage();
    }
    int n1,n2;
    int countCorrect=0,countIncorrect=0;
    int count=countCorrect+countIncorrect;
    public void randomValue(){
        Random R=new Random();
        n1=R.nextInt(9);
        n2=R.nextInt(9);
        question(n1,n2);
    }
    public void question(int n1,int n2){
        System.out.println("How much is "+n1+" times "+n2+"?");
        int result=n1*n2;
        resultCheck(result);
    }
    public void resultCheck(int result){
        Scanner S=new Scanner(System.in);
        int userInput=S.nextInt();
        if(userInput==result){
            countCorrect++;
            correctAnswer();
            randomValue();
        }
        else{
            countIncorrect++;
            incorrectAnswer();
            question(n1,n2);
        }
    }
    public void correctAnswer(){
        Random R=new Random();
        int randomValue=1+R.nextInt(3);
        switch(randomValue){
            case 1:
                System.out.println("Very good!");
            break;
            case 2:
                System.out.println("Excellent!");
            break;
            case 3:
                System.out.println("Nice work!");
            break;
            case 4:
                System.out.println("Keep up the good work!");
            break;
            }
    }
    public void incorrectAnswer(){
        Random R=new Random();
        int randomValue=1+R.nextInt(3);
        switch(randomValue){
            case 1:
                System.out.println("No. Please try again!");
            break;
            case 2:
                System.out.println("Wrong. Try once more!");
            break;
            case 3:
                System.out.println("Don't give up!");
            break;
            case 4:
                System.out.println("Keep ttryi!");
            break;
            }
    }
    public void correctPercentage(){
        int cP=(countCorrect/10)*100;
        if(cP>=75){
            System.out.println("Congratulations, you are ready to go to the next level!");
        }
        else{
            System.out.println("Please ask your teacher for extra help!");
        }
    }
}
