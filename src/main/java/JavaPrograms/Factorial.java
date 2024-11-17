package JavaPrograms;

import java.math.BigInteger;

public class Factorial {
    static void getFactorial(int number) {
        int fact=1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }

    static int getFactorial1(int number) {
        if(number==0){
            return 1;
        }
        else{
            return number*getFactorial1(number-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(getFactorial1(5));
        System.out.println(Integer.parseInt("000"));
    }
}