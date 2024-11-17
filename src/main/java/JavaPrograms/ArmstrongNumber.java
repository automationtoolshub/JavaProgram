package JavaPrograms;

public class ArmstrongNumber {

    public static void isArmStrongNum(int inputNumber){

        int num = inputNumber;
        int arm = 0;
        while(num>0){
            int n = num%10;
            arm = arm+n*n*n;
            num=num/10;
        }
        System.out.println(arm);
        if(arm==inputNumber){
            System.out.println("it is armstorng number");
        }else
        {
            System.out.println("it is not armstrong number");
        }

    }

    public static void main(String[] args) {
        ArmstrongNumber.isArmStrongNum(1591);
    }
}