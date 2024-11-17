package JavaPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindDuplicateCharacterInString {

    public static void getDuplicate(String input){
        String[] ch =input.replaceAll("\\s+","").split("");
        Map<String, Integer> map = new LinkedHashMap<>();
        for(String letter:ch){

            if(!map.containsKey(letter)){
                map.put(letter,1);
            }
            else{
                map.put(letter, map.get(letter)+1);
                // map.merge(letter, 1,Integer::sum);
            }
        }
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                System.out.print(entry.getKey()+" ");
                // break;
            }
        }
    }

    public static void main(String[] args) {
        FindDuplicateCharacterInString.getDuplicate("My name is karthik");
        System.out.println( Integer.MAX_VALUE);
        System.out.println( Integer.MIN_VALUE);
    }
}