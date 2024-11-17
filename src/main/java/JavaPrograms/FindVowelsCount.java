package JavaPrograms;


import java.util.*;

public class FindVowelsCount {

    public boolean isVowel(char ch){
        ch=Character.toUpperCase(ch);
        return (ch=='A' || ch=='E' || ch=='I' ||
                ch=='O' || ch=='U');

    }
    public int  numberOfVowels(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (isVowel(input.charAt(i))) {
                count = count + 1;
            }
        }
        System.out.println(count);
        return count;
    }

    public static void findVowels(String input){
        String s = input;
        int afterReplace= input.toLowerCase().replaceAll("[aeiou]","").length();
        int orginal = input.length();
        if(afterReplace!=orginal){
            System.out.println("it does not have vowels");
        }
        else{
            System.out.println("it has vowels");
        }
    }

    public static void main(String[] args) {
        /// String s=new FindVowelsCount().numberOfVowels("karthik")>0?"it has vowel":"no vowel";
        //System.out.println(s);
        findVowels("BBB");

    }
}