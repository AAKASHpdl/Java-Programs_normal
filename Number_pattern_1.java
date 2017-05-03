/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/
package Programs;
public class Number_pattern_1 {
    public static void main(String [] args){
        int i,n;
        for(i=1;i<=5;i++){
            for(n=1;n<=i;n++){
                System.out.print(n+" ");
                }
            System.out.println();
        }
    }
}