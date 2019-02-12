public class SumDigitsChallenge {

    public static void main(String[] args) {


        System.out.println(sumDigits(2019));
    }

    public static int sumDigits (int number){
        if (number > 9) { 
            int sum = number % 10;

            while (number / 10 > 9) {
                number = number / 10;
                sum = sum + (number % 10);

                if (number / 10 <= 9) {
                    sum = sum + (number / 10);
                    break;
                }
            }
            return sum;
        }
       return -1;
    }
}
