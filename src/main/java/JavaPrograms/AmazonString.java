package JavaPrograms;

import java.util.*;

public class AmazonString {

    public static void duplicateValues(List<String> listOfValues){
        List<String> list = new ArrayList<>();
        // Set<String> set = new LinkedHashSet<>();
        Map<String,Integer> map= new HashMap<>();
        for(String s:listOfValues){

            if(!map.containsKey(s)){
                list.add(s);
                map.put(s,1);
            }
            else{
                list.add(s+"("+map.get(s)+")");
                map.put(s,map.get(s)+1);
            }


        }
        Set<String> s = new HashSet<>(list);
        System.out.println(s);
    }

    public static void main(String[] args){
        List<String> inputList = new ArrayList<>(Arrays.asList("test","test","test"));
        duplicateValues(inputList);
    }

}