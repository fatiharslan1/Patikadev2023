import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int number ;
        double answer = 0;
        System.out.print("Enter a number : ");
        number =in.nextInt();

        for(int i = 1; i<=number;i++){
            answer+=(1.0/i);
        }
        System.out.println("Answer is " + answer);

    }
}