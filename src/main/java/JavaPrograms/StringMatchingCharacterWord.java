package JavaPrograms;

import java.util.*;

public class StringMatchingCharacterWord {

    public static void findMatchingWords(String input,String word){
        boolean flag = false;
        ArrayList<Boolean> boo = new ArrayList<>();
        Map<String, Integer> inputMap = new HashMap<>();
        Map<String, Integer> wordMap = new HashMap<>();
        String[] inputStr= input.split("");
        String[] wordStr= word.split("");
        for(int i=0;i<inputStr.length;i++){
            if (!inputMap.containsKey(inputStr[i])) {
                inputMap.put(inputStr[i], 1);
            } else {
                inputMap.put(inputStr[i], inputMap.get(inputStr[i]) + 1);
            }
        }
        for(int i=0;i<wordStr.length;i++){
            if (!wordMap.containsKey(wordStr[i])) {
                wordMap.put(wordStr[i], 1);
            } else {
                wordMap.put(wordStr[i], wordMap.get(wordStr[i]) + 1);
            }
        }
        for(Map.Entry<String,Integer> inputEtnry:inputMap.entrySet()){
            String inputMapKey = inputEtnry.getKey();
            Integer inputMapValue = inputEtnry.getValue();
            Integer wordMapValue = wordMap.get(inputMapKey);
            if(wordMapValue!=null){
                if(inputMapValue==wordMapValue) {
                    boo.add(true);
                }
                else{
                    boo.add(false);
                }
            }

        }
        //System.out.println(boo);
        if(!boo.isEmpty() && !boo.contains(false)){
            System.out.println("expected==="+word);
        }
    }

    public static void main(String[] args) {

        List<String> listOfWords = Arrays.asList("abc", "abcdb", "gggh", "klsrtbcab", "118*90","ggggggggggggggggggggggggggggggggg");
        //List<String> listOfWords = Arrays.asList("abc");
        String inputWord = "abbc";

        for(String word:listOfWords){
            findMatchingWords(inputWord,word);
        }

    }
}