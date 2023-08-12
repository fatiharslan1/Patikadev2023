import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;

        Scanner in = new Scanner(System.in);

        System.out.print("Please, Entera number : ");
        number = in.nextInt();

        for(int i=0;i<=number;i++){
            if((i%4==0)&&(i%5==0)){
                System.out.println(i);
            }
        }
    }
}