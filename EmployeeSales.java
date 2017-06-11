import java.util.Random;
public class EmployeeSales {
    public static void main(String[] args) {
        int [] [] sales = new int [4] [5];
        int totalSalesEmployeeWise = 0;
        int totalSalesProductWise = 0;
        Random r1 = new Random();
        for(int i = 0; i< sales.length; i++){
            for(int j = 0; j< sales[i].length; j++ ){
                sales [i][j] = r1.nextInt(9);
            }
        }
        System.out.print("Product\t");
        for(int k = 0; k< sales[0].length; k++){
            System.out.print("\t" + (k+1));
             
        }
        System.out.println("\t\tTotal");
        System.out.println("=======================================================================");
        for(int i =0; i< sales.length; i++){
            System.out.print("Employee "  + (i+1) + ": ");
            System.out.print("[\t");
             
            for(int j = 0; j < sales[i].length; j++){
                totalSalesEmployeeWise+= sales[i][j];
                System.out.print(sales[i][j] + "\t");
            }
             
             
            System.out.print("]\t"+ totalSalesEmployeeWise + "\n");
            totalSalesEmployeeWise =0;
         }
         System.out.println("========================================================================");
        System.out.print("Total \t\t");
        for(int j = 0; j< sales[0].length; j++){
            for(int i = 0; i < sales.length; i++){
                totalSalesProductWise+= sales[i][j];
            }
            System.out.print(totalSalesProductWise + "\t");
            totalSalesProductWise =0;
        } 
        System.out.println(""); 
         
    }
    
}
