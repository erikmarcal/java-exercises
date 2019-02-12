import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class MyArrays {
    private static Scanner scanner = new Scanner(System.in);
    
    
    
    public static void main(String args[]) {
        int qtdy = 0;
        System.out.println("Enter the quantity of number you want to sum: \r ");
        
        qtdy = scanner.nextInt();
        
        int[] myIntArray = getInteger(qtdy);
        
        printArray(myIntArray);
        sortArray(myIntArray);
        printArray(myIntArray);
              
    }
    
    public static int[] getInteger (int qtdy) {
         int[] values = new int [qtdy];
         System.out.println("Please, inform your " + qtdy + " numbers to sum");
         
         for(int i = 0 ; i < values.length; i++ ) {
             values[i] = scanner.nextInt();
         }
         
         return values;
    }
    
    public static void printArray (int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("index " + i + ", with the value " + array[i]);
        }
    }
    
    public static int sortArray (int[] array) {
        int[] sortArray = new int [array.length];
        
       
        for (int i = 0; i < array.length ; i++) {
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for (int i = 0; i <sortedArray.length; i++) {
                if (sortedArray[i] < sortedArray[i+1]) {
                    tempo = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag  = true;
                }
            }
        }
        return sortedArray;
        
    }
}

