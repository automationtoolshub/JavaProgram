package JavaPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringHasVowel {

    public static void isVowel(String input){
        String regex = "[aeiouAEIOU]";
        Pattern p=Pattern.compile(regex);
        Matcher match=p.matcher(input);
        int count =0;
        while(match.find()){
            System.out.println(match.group());
            count=count+1;
        }

        System.out.println(count);
        List<String> l=new ArrayList<>();
        l.add("test");
        l.add("Test");
        l.add("kaa");
        Collections.reverse(l);
        System.out.println("===="+l);
        l.sort(Comparator.nullsLast(String.CASE_INSENSITIVE_ORDER));
        System.out.println(l);
        l.sort(Comparator.nullsLast(String.CASE_INSENSITIVE_ORDER).reversed());
        System.out.println(l);
    }

    public static void main(String[] args) {
        StringHasVowel.isVowel("karthikk i am good");
    }
}