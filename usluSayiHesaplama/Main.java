import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n,k,answer=1;

        Scanner in = new Scanner(System.in);

        System.out.print("Üssü alınnacak sayı : ");
        n= in.nextInt();

        System.out.print("Üs olacak sayı : " );
        k = in.nextInt();

        for(int i=1; i<=k;i++){
            answer= answer*n;
        }

        System.out.print("Cevap : "+ answer);
    }
}