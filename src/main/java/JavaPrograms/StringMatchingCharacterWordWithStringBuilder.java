package JavaPrograms;

import java.util.Arrays;
import java.util.List;

public class StringMatchingCharacterWordWithStringBuilder {

public static void findMatchingWords(String input,String word){
        StringBuilder wordBuff = new StringBuilder(word);
        String inputArr[] = input.split("");
        boolean flag = false;
        for(int i=0;i< inputArr.length;i++){
        try {
        wordBuff.deleteCharAt(wordBuff.indexOf(inputArr[i]));
        } catch (Exception e) {
        flag=true;
        }

        }
        if(!flag){
        System.out.println("=="+word);
        }
        }
public static void main(String[] args) {

        List<String> listOfWords = Arrays.asList("abc", "abcdb", "gggh", "klsrtbcab", "118*90","ggggggggggggggggggggggggggggggggg");
        String inputWord = "abbc";

        for(String word:listOfWords){
        findMatchingWords(inputWord,word);
        }
        }
        }