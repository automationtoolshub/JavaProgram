
package JavaPrograms;


public class SortmapwithoutJava8 {

    public static void main(String[] args) {
        boolean flag= true;
        String input ="{[}]";
        if(input.length()%2!=0){
            flag = false;
        }
        while(input.contains("a")){
            input=input.replaceAll("\\(\\)","")
                    .replaceAll("\\[\\]","")
                    .replaceAll("\\{\\}","");
        }
        if (input.length()==0){
            flag = true;
        }
        else{
            flag = false;

        }
        if(flag){
            System.out.println("it is perfect");
        }
        else{
            System.out.println("it is not perfect");
        }
    }

}