import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mesafe, yas, yolculukTipi;
        double mesafeUcreti=0.10, yasIndirimi=0, yolculukTipiIndirimi = 0.20;
        double normalTutar, YasIndirimi, indirimliTutar, gDBInidrimi, toplamTutar=0;

        Scanner in = new Scanner(System.in);

        System.out.println("Hoşgeldiniz!!");

        System.out.print("Mesafeyi km türünden giriniz : ");
        mesafe = in.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        yas = in.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        yolculukTipi = in.nextInt();

        if(yas <=12){
            yasIndirimi = 0.50;
        } else if (yas <=24) {
            yasIndirimi = 0.10;
        } else if (yas>=65) {
            yasIndirimi = 0.30;
        }

        switch (yolculukTipi){
            case 1:
                normalTutar = mesafe * mesafeUcreti;
                YasIndirimi = normalTutar * yasIndirimi;
                indirimliTutar = normalTutar - YasIndirimi;
                toplamTutar = indirimliTutar ;
                System.out.println("Toplam Tutar = "+ toplamTutar+" TL");
                break;
            case 2:
                normalTutar = mesafe * mesafeUcreti;
                YasIndirimi = normalTutar * yasIndirimi;
                indirimliTutar = normalTutar - YasIndirimi;
                gDBInidrimi = indirimliTutar * yolculukTipiIndirimi;
                toplamTutar = (indirimliTutar - gDBInidrimi)*2;
                System.out.println("Toplam Tutar = "+ toplamTutar+" TL");
                break;
            default:
                System.out.println("Hatalı Veri Girdiniz !");
        }


    }
}