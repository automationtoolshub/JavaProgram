package JavaPrograms;

import java.util.*;

public class Bigram {

    public static void getBigram(String input){

        String[] strArray= input.split(" ");
        System.out.println(strArray.length);
        List<String> list = new ArrayList<>(Arrays.asList(strArray));
        Map<String,Integer> map = new HashMap<>();
        for(String s:strArray){
            map.put(s,1);
        }
        System.out.println(map);
        for(int i=0;i<list.size()-1;i++){
            int value=map.get(list.get(i)) + map.get(list.get(i+1));
            System.out.println(list.get(i) +" "+list.get(i+1)+" :"+value);
            map.put(list.get(i),0);
            map.put(list.get(i+1),0);
        }

    }

    public static void main(String[] args) {
        String s ="The The quick brown fox and the quick blue hare";
        getBigram(s);
    }
}