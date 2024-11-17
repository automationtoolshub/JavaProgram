package JavaPrograms;

import java.util.Arrays;

public class Anagram {

    public static void isAnagram1(String s1, String s2){
        boolean isAnagram = true;
        s1=s1.toUpperCase().replaceAll("\\s+","");
        s2=s2.toUpperCase().replaceAll("\\s+","");
        if(s1.length()!=s2.length()){
            isAnagram=false;
        }

        String[] ch1 = s1.split("");
        String[] ch2 = s2.split("");
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        isAnagram = Arrays.equals(ch1,ch2);

        System.out.println(isAnagram);

        if(isAnagram){
            System.out.println("it is Anagram");
        }
        else{
            System.out.println("it is not Anagaram");
        }
    }

    public static void isAnagram2(String s1, String s2){
        boolean isAnagram = true;
        if(s1.length()!=s2.length()){
            isAnagram=false;
        }
        StringBuffer sBuf1 = new StringBuffer(s1.toLowerCase());

        for(String ch:s2.toLowerCase().split("")){
            int index = sBuf1.indexOf(ch);
            if(index!=-1){
                sBuf1.deleteCharAt(index);
            }
            else{
                isAnagram=false;
            }

        }
        if(isAnagram){
            System.out.println("it is Anagram");
        }
        else{
            System.out.println("it is not Anagaram");
        }
    }
    public static void main(String[] args) {

        Anagram.isAnagram1("karthik","karth      iK");
    }
}