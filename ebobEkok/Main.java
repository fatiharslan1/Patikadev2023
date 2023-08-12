import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number1, number2;

        Scanner in = new Scanner(System.in);

        System.out.print("Please enter a number 1 : ");
        number1 = in.nextInt();

        System.out.print("Please enter a number 2 : ");
        number2 = in.nextInt();

        int bigNumber, smallNumber;
        if(number1>number2){
            bigNumber=number1;
            smallNumber=number2;
        }else {
            smallNumber=number1;
            bigNumber= number2;
        }

        int ebob =1;

        for(int i = 1; i<=bigNumber;i++){
            if(bigNumber%i==0 && smallNumber%i==0){
                //System.out.println(i);
                ebob= i;
            }
        }

        for(int k = bigNumber; k>=1;k--){
            if(bigNumber%k==0&& smallNumber%k==0){
                ebob = k;
                System.out.println("ebob : "+ebob);
                break;
            }
        }

        for(int j=1; j<= (bigNumber*smallNumber);j++){
            if(j%bigNumber==0 && j%smallNumber==0){
                System.out.println("ekok : "+ j);
                break;
            }
        }
    }
}