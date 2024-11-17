package JavaPrograms;

import java.util.stream.IntStream;

public class PrimeNumber {
    public void isPrimeNumber(int num)    {
        boolean isPrime=true;
        if(num<=1){
            isPrime=false;
        }
        else if(num==2){
            isPrime=true;
        }
        else if (num%2==0){
            isPrime=false;
        }
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                isPrime=false;
                break;
            }
        }
        if(isPrime)
            System.out.println(num + " is a Prime Number");
        else{
            System.out.println(num + " is not a Prime Number");
        }

    }

    public void isPrimeNumber2(int num){
        boolean isPrime = false;
        if (num<=1){
            isPrime=false;
        }
        else {
            isPrime = IntStream.rangeClosed(2, num/2).noneMatch(i -> num%i == 0);
            System.out.println(isPrime);
        }

        if(isPrime){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }

    public static void main(String[] args) {
        new  PrimeNumber().isPrimeNumber2(3);
    }
}