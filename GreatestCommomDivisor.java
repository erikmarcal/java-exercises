public class Main {
    public static void main(String args[]) {
        System.out.println(getGreatestCommonDivisor(81,153));
        
        
    }
    public static int getGreatestCommonDivisor (int first, int second) {
        int divisor = 0;
        int common = 0;
        
        if (first < 10 || second < 10) {
            return -1;
        } else if (first > second) {
            
            for (divisor = first; divisor > 0; divisor --) {
                
                int rest1 = first % divisor;
                int rest2 = second % divisor;
                
                if (rest1 == 0 && rest2 == 0 ){
                    common = divisor;
                    break;
                }
            }
        } else if (second > first) {
            
            for (divisor = second; divisor > 0; divisor -- ) {
                
                int rest1 = first % divisor;
                int rest2 = second % divisor;
                
                if (rest1 == 0 && rest2 == 0) {
                    common = divisor;
                    break;
                }
            }
        }
        return common;
        
        
    }
}
