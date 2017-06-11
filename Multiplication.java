import java.util.Scanner;
import java.util.Random;
public class Multiplication {
    public static void main(String [] args){
        Multiplication M=new Multiplication();
        M.difficultyLevel();
    }
    Scanner S=new Scanner(System.in);
    Random R=new Random();
    int d,pT,rP,n1,n2;
    int countCorrect=0,countIncorrect=0,count=0;
    public void difficultyLevel(){
        System.out.println("###Please Enter your difficulty level###");
        System.out.println("1.  Single digit numbers");
        System.out.println("2.  Double digit numbers");
        d=S.nextInt();
        problemType();
    }
    public void problemType(){
        System.out.println("###Please Enter your type of problem###");
        System.out.println("1.  Addition            2.Subtraction");
        System.out.println("3.  Multiplication      4.Divison");
        System.out.println("           5.Random Problem");
        pT=S.nextInt();
        randomValue();
    }
    public void randomValue(){
        if(d==1){
        n1=R.nextInt(9)+1;
        n2=R.nextInt(9)+1;
        question(n1,n2);
        }
        if(d==2){
        n1=R.nextInt(99-10)+10;
        n2=R.nextInt(99-10)+10;
        question(n1,n2);
        }
    }
    public void question(int n1,int n2){
        if(count==10){
            correctPercentage();
        }
        else if(pT==5){
            rP=R.nextInt(4)+1;
        }
       if(pT==1||rP==1){
            System.out.println("How much is "+n1+" added to "+n2+"?");
            int result=n1+n2;
            resultCheck(result);
        }
        else if(pT==2||rP==2){
            System.out.println("How much is "+n1+" subtracted to "+n2+"?");
            int result=n1-n2;
            resultCheck(result);
        }
        else if(pT==3||rP==3){
            System.out.println("How much is "+n1+" times "+n2+"?");
            int result=n1*n2;
            resultCheck(result);
        }
        else if(pT==4||rP==4){
            System.out.println("How much is "+n1+" divided by "+n2+"?");
            int result=n1/n2;
            resultCheck(result);
        }
    }
 
    public void resultCheck(int result){
        int userInput;
        userInput=S.nextInt();
        
        
            if(userInput==result){
                countCorrect++;
                count=countCorrect+countIncorrect;
                correctAnswer();
                randomValue();
            }
            else{
                countIncorrect++;
                count=countCorrect+countIncorrect;
                incorrectAnswer();
                question(n1,n2);
           }
            
    }
    public void correctAnswer(){
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
                System.out.println("Keep trying!");
            break;
            }
    }
    public void correctPercentage(){
        int cP=(countCorrect/10)*100;
        count=0;countCorrect=0;countIncorrect=0;
        if(cP>=75){
            System.out.println();
            System.out.println("Congratulations, you are ready to go to the next level!");
            System.out.println();
            difficultyLevel();
        }
        else{
            System.out.println();
            System.out.println("Please ask your teacher for extra help!");
            System.out.println();
            difficultyLevel();
        }
    }
}
