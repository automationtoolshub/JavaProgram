package JavaPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class PrintPrimeNumbers {

    public static boolean isPrime(int num){
        boolean isPrime =false;
        if(num<2){
            isPrime=false;
        }
        else{
            isPrime = IntStream.rangeClosed(2,num/2).noneMatch(i->num%i==0);
            //System.out.println(isPrime);
        }
        return isPrime;
    }

    public static void printPrimeNumbers(int number){

        for (int i=2;i<=number;i++){
            if(isPrime(i)){
                System.out.println("primeNumbers==:"+i);
            }
        }

    }


    public static void nthPrimeNumber(int number){
        List<Integer> list = new ArrayList<>();
        for (int i=2;;i++){
            if(isPrime(i)){
                list.add(i);
                if(list.size()==number){
                    System.out.println("primeNumbers==:"+i);
                    break;
                }
            }

        }
    }


    public static void main(String[] args) {
        // PrintPrimeNumbers.isPrime(11);
        PrintPrimeNumbers.printPrimeNumbers(100);
        // PrintPrimeNumbers.nthPrimeNumber(9);
    }
}

   /* int i =2;
        while(list.size()<number){
        if(isPrime(i) ){
        list.add(i);
        System.out.println("primeNumbers==:"+i);
        }
        if(list.size()==number){
        System.out.println("nth element==:"+i);
        break;
        }
        i=i+1;
        // countSize=count.size();
        }*/