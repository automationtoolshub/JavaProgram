package JavaPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingArray {

    public static int findMissingNumberInArray(Integer[] array, int maxNumber ){

        int sumOfArray = Arrays.stream(array).filter(x->x!=null).mapToInt(x->x).sum();
        System.out.println("Sum of Array==="+sumOfArray);
        System.out.println("Sum of Array2==="+maxNumber*(maxNumber+1)/2);
        int sumOfNatural = IntStream.rangeClosed(1,maxNumber).sum();
        System.out.println("Sum of Natural==="+sumOfNatural);
        int maximum = Arrays.stream(array).filter(x->x!=null).mapToInt(x->x).max().getAsInt();
        System.out.println("Maximum Number==="+maximum);
        int minimum = Arrays.stream(array).filter(x->x!=null).mapToInt(x->x).min().getAsInt();
        System.out.println("Minimum Number==="+minimum);
        return sumOfNatural - sumOfArray;

    }


    public static void main(String[] args) {
        System.out.println(MissingArray.findMissingNumberInArray(new Integer[]{1,2,3,4,5},6));



    }
}