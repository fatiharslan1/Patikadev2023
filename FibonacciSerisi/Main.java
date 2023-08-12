import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number,answer=0, n2,n3=1;

        System.out.print("Please, enter a number : ");
        number = in.nextInt();

        for(int i =0; i<number;i++){
            n2=n3;
            n3=answer;
            answer= n2+n3;
            System.out.println(answer);
        }

    }
}