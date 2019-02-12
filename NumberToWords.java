public class NumberToWords {
    public static void main(String args[]) {
       System.out.println(getDigitCount(1));
    }
    public static void numberToWords (int number) {
        if (number < 0) {
            System.out.println("invalid Value");
        }
        
        int last = 0;
        int originalDigits = getDigitCount(number);
        number = reverse(number);
        int afterReverseDigits = getDigitCount(number);
        int zerosCount = originalDigits - afterReverseDigits;
        
        while (number > 0) {
            last = number % 10;
            number = number / 10;
            
            switch (last) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
            }
        }
        while(zerosCount > 0) {
             System.out.print("Zero ");
             zerosCount--;
        }
    }
    
    public static int reverse (int number) {
        int last = 0;
        int reverse = 0;
        
        if (number > 0) {
            while (number != 0) {
                
                if (number < 10) {
                    last = number;
                    reverse = (reverse * 10) + last;
                    break;
                }
                last = number % 10;
                reverse = (reverse * 10) + last;
                number = number / 10;
            }
        } else if (number < 0) {
            while (number != 0) {
                last = number % 10;
                reverse = (reverse * 10) + last;
                number = number / 10;
            }
        }
        return reverse;
    }
    
    public static int getDigitCount (int number) {
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        }
        int digit = 0;
        int last = 0;
        int reverse = 0;
        
        while (number != 0) {
            if (number < 10) {
                    last = number;
                    reverse = (reverse * 10) + last;
                    digit += 1;
                    break;
                }
                last = number % 10;
                reverse = (reverse * 10) + last;
                number = number / 10;
                digit += 1;
        }
        return digit;
    }
}
