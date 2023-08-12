import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double fiyat, armut =2.14, elma =3.67, domates=1.11, muz=0.95,patlıcan=5.00;
        int akg, ekg, dkg, mkg, pkg;

        Scanner in = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? : ");
        akg = in.nextInt();
        System.out.print("Elma Kaç Kilo ? : ");
        ekg = in.nextInt();
        System.out.print("Domates Kaç Kilo ? : ");
        dkg = in.nextInt();
        System.out.print("Muz Kaç Kilo ? : ");
        mkg = in.nextInt();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        pkg = in.nextInt();

        fiyat =(pkg*patlıcan)+(akg*armut)+(mkg*muz)+(ekg*elma)+(dkg*domates);
        System.out.println("Toplam tutar : " + fiyat);

    }
}