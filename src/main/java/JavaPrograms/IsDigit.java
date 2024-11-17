
package JavaPrograms;

import java.util.List;

public class IsDigit {
    int a =10;
    public static void verifyDigit(String input){
        char[] ch=input.toCharArray();
        for(char c:ch){
            if(!Character.isAlphabetic(c) && !Character.isDigit(c)) {
                System.out.println(c);
            }
        }

    }

    public static void main(String[] args) {
        verifyDigit("14Karthik88$4 7!");

    }
}