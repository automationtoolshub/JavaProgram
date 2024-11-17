package JavaPrograms;

import java.util.*;

public class DuplicateCharacterFromString {

    public static void removeDuplicate(String input){
        String[] str= input.split("");
        Set<String> setStr = new LinkedHashSet<>(Arrays.asList(str));
        String output="";
        for(String s:setStr){
            output = output+s;
        }
        System.out.println(output);
    }

    public static void main(String[] args) {
        removeDuplicate("Today is Monday");
        Map<String,Integer> map = new HashMap<>();
        String input1="Today is Monday";
        for(String s:input1.replaceAll("\\s+","").split("")){
            if(!map.containsKey(s)){
                map.put(s,1);
            }
            else{
                map.put(s,map.get(s)+1);
            }
        }
        System.out.println(map);
        int maxValues= Collections.max(map.values());
        System.out.println(maxValues);
        for(Map.Entry<String, Integer> mm:map.entrySet()){
            if(mm.getValue()==maxValues){
                System.out.println(mm.getKey() +":"+maxValues);
            }
        }

    }
}