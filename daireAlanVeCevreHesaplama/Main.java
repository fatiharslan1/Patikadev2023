import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double pi =3.14;
        int yariÇap;
        double alan, cevre, dilimAlan, aci;

        Scanner in = new Scanner(System.in);
        System.out.print("Dairenin yarı çapını giriniz :");
        yariÇap = in.nextInt();
        alan = pi * yariÇap* yariÇap;
        cevre = 2*pi*yariÇap;
        System.out.println("##############################");
        System.out.println("Dairenin alanı : " + alan);
        System.out.println("Dairenin çevresi : "+ cevre);
        System.out.println("##############################");

        // ödev
        System.out.print("Merkez açının ölçüsünü giriniz :");
        aci = in.nextInt();
        dilimAlan =(pi *(yariÇap*yariÇap)*aci)/360;
        System.out.println("##############################");
        System.out.println("Dairenin diliminin alanı : " + dilimAlan);
        System.out.println("##############################");


    }
}