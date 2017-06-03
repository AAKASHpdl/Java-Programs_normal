public class ArrayDemo {
    public static int[] negativeArray(int[] array){
        for(int i=0;i<array.length;i++){
            array[i]-=5;
        }
        return array;
    }
    public static void main(String[] args){
        int array[] = {2,4,6,8};
        int result[] = negativeArray(array);
        for (int j=0;j<array.length;j++){
            System.out.println(result[j]);
        }
        
    }
}
