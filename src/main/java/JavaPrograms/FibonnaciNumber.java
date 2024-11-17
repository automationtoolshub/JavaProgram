package JavaPrograms;

public class FibonnaciNumber {

    public static void PrintFibonnaciNumber(int number){
        //0,1,1,2,3,5,8,13...

        int sum=0;
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<number;i++){
            sum=a+b;
            System.out.println(sum);
            a=b;
            b=sum;
        }
    }

    public static void PrintFibonnaciNumber1(int number){
        //0,1,1,2,3,5,8,13...

        int sum=0;
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        while(sum<=number){
            sum=a+b;
            if(sum>=number){
                break;
            }
            System.out.println(sum);
            a=b;
            b=sum;
        }
    }

    public static void main(String[] args) {
        FibonnaciNumber.PrintFibonnaciNumber(10);
    }
}