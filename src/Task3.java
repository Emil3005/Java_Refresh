/*
Given a number and its base, convert it to decimal. The base of number can be anything such that all digits can be
represented using 0 to 9 and A to Z. The value of A is 10, the value of B is 11 and so on. Write a function to convert
the number to decimal.
Sample
Input: str = “1100”, base = 2
Output: 12
 */

public class Task3 {
    public static void main(String[] args) {
        int[] input = {1,1,0,0};
        int base = 2;
        System.out.print("Ergebnis ist " + calc(input, base));
       
    }
    public static int calc(int[] value, int base){
        int result = 0;
        for(int i=value.length-1;i>=0;i--){
            result = result + value[i] * power(base, value.length-i-1); 
        }
        return result;
    }
    public static int power(int base, int exponent){
        int result = 1;
        for (int i=0;i<exponent;i++){
            result = result * base;
        }
        return result;
    }
}
