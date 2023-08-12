import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number = 0,sum=0;

        Scanner in = new Scanner(System.in);

        while (number%2==0) {
            System.out.print("Please, Enter a number : ");
            number = in.nextInt();
            if(number%4==0){
                sum+=number;
            }
        }
        System.out.println("sum : "+sum);
    }
}