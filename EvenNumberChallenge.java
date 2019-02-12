public class EvenNumber {
    public static void main(String args[]) {
       int number = 4;
       int finishNumber = 20;
       int count = 0;
       
       while (number <= finishNumber) {
           number++;
           if (!isEvenNumber(number)) {
               continue;
           }
           count++;
           System.out.println("Even Number " + number);
           
           if (count == 5) {
               System.out.println("I founded 5 even number. Stoping running.");
               break;
           }else {
               continue;
           }
       }
    }
    
    public static boolean isEvenNumber (int number) {
        if ((number % 2) == 0 ) {
            return true;
        }else {
        return false;
        }
    }
}
