import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n,r,nTotal=1,rTotal=1,cTotal=1,Total;

        Scanner in = new Scanner(System.in);

        System.out.print("Please, Enter N : ");
        n = in.nextInt();

        System.out.print("Please, Enter R : ");
        r = in.nextInt();

        for(int i = 1; i<=n;i++){
            nTotal = nTotal*i;
        }
        for(int i = 1; i<=r;i++){
            rTotal = rTotal*i;
        }
        for(int i = 1; i<=n-r;i++){
            cTotal = cTotal*i;
        }

        Total=nTotal/(rTotal*cTotal);

        System.out.println("C("+n+","+r+") : "+Total);

    }
}