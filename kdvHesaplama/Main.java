import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        // değişkenleri tanımlama
        double KDV = 0.18;
        int para ;

        // scanner sınıfını tanımladık
        Scanner inp = new Scanner(System.in);

        // kullanıcı dan değerleri alma
        System.out.print("Lütfen para değeri giriniz : ");
        para = inp.nextInt();

        double sonuc = para + (para*KDV);
        System.out.println("Girilen değerin KDV li hali : " + sonuc);


 */
        // ödev

        // değişkenleri tanımlama
        int para ;

        // scanner sınıfını tanımladık
        Scanner inp = new Scanner(System.in);

        // kullanıcı dan değerleri alma
        System.out.print("Lütfen para değeri giriniz : ");
        para = inp.nextInt();

        if(para<=1000){
            double KDV=0.18;
            double sonuc = para + (para*KDV);
            System.out.println("Girilen değerin KDV li hali : " + sonuc);
        }else{
            double KDV=0.08;
            double sonuc = para + (para*KDV);
            System.out.println("Girilen değerin KDV li hali : " + sonuc);
        }
    }
}