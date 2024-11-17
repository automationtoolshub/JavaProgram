package JavaPrograms;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

import static java.util.Collections.synchronizedList;

public class StringReverse {

    public static String reverseString(String input) {
        char[] cArray = input.toCharArray();
        String reverse = "";
        for (int i = cArray.length - 1; i >= 0; i--) {
            System.out.println(cArray[i]);
            reverse = reverse + cArray[i];
        }
        System.out.println(reverse);
        return reverse;

    }

    public static String reverseStringUsingSplit(String input) {
        String[] cArray = input.split("");
        String reverse = "";
        for (int i = cArray.length - 1; i >= 0; i--) {
            System.out.println(cArray[i]);
            reverse = reverse + cArray[i];
        }
        System.out.println(reverse);
        return reverse;

    }


    public static String reverseRecursive(String input) {
        if (input != null && input.length() == 0) {
            return input;
        }
        //System.out.println("==="+reverseRecursive(input.substring(1)) + input.charAt(0));
        // System.out.println(input.charAt(0));
        return reverseRecursive(input.substring(1)) + input.charAt(0);
    }




    public static void main (String[]args){
        // StringReverse.reverseString("Karthik");
        // StringReverse.reverseStringUsingSplit("Karthik");
        System.out.println(StringReverse.reverseRecursive("Ravi"));
        // System.out.println("====="+"karthik".charAt(0)+"karthik".charAt(1));
    }

}