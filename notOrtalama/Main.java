import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // değişkenler
        int mat, fizik, kimya, turkce, tarih, muzik;

        // scanner sınıfını tanımladık
        Scanner inp = new Scanner(System.in);

        // kullanıcı değerleri alma
        System.out.print("Matenatik notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Turkce notunuz : ");
        turkce = inp.nextInt();

        System.out.print("Tarih notunuz : ");
        tarih = inp.nextInt();

        System.out.print("Muzik notunuz : ");
        muzik = inp.nextInt();

        int toplam =(mat+ fizik+kimya+tarih+turkce+muzik);
        double sonuc = toplam/6;

        if (sonuc>=60) {
            System.out.println("Ortalamanız : " + sonuc+ " Geçtiniz...");
        }else{
            System.out.println("Ortalamanız : " + sonuc+ " Kaldınız...");
        }




    }
}