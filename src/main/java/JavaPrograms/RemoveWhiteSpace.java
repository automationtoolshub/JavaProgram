package JavaPrograms;

public class RemoveWhiteSpace {

    public static void removeSpace(String input){
        String rSpace=input.replaceAll("\\s+","");
        System.out.println(rSpace);

    }
    public static void main(String[] args) {

        RemoveWhiteSpace.removeSpace("my name   is  Kar      thik");
    }
}