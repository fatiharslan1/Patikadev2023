import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int month, day;
        boolean isError = false;

        Scanner in = new Scanner(System.in);

        System.out.println("Hoşgeldiniz...");

        System.out.print("Hangi ayda doğdunuz : ");
        month = in.nextInt();

        System.out.print("Doğum gününüz ne zaman : ");
        day = in.nextInt();

        switch (month){
            //Ocak
            case 1:
                if(day>=1 && day<=31){
                    if(day<22){
                       System.out.print("Burcunuz OĞLAK!");
                    }else {
                        System.out.print("Burcunuz KOVA!");
                    }
                }else{
                    isError = true;
                }
                break;
            //Şubat
            case 2:
                if(day>=1 && day<=28){
                    if(day<20){
                        System.out.print("Burcunuz KOVA!");
                    }else {
                        System.out.print("Burcunuz BALIK!");
                    }
                } else {
                    isError = true;
                }
                break;
            //Mart
            case 3:
                if(day>=1 && day<=31) {
                    if (day < 21) {
                        System.out.print("Burcunuz BALIK!");
                    } else {
                        System.out.print("Burcunuz KOÇ!");
                    }
                }else{
                    isError = true;
                }
                break;
            //Nisan
            case 4:
                if(day>=1 && day<=30) {
                    if (day < 21) {
                        System.out.print("Burcunuz KOÇ!");
                    } else {
                        System.out.print("Burcunuz BOĞA!");
                    }
                }else{
                    isError = true;
                }
                break;
            //Mayıs
            case 5:
                if(day>=1 && day<=31) {
                    if (day < 22) {
                        System.out.print("Burcunuz BOĞA!");
                    } else {
                        System.out.print("Burcunuz İKİZLER!");
                    }
                }else{
                    isError = true;
                }
                break;
            //Haziran
            case 6:
                if(day>=1 && day<=30) {
                    if (day < 23) {
                        System.out.print("Burcunuz İKİZLER!");
                    } else {
                        System.out.print("Burcunuz YENGEÇ!");
                    }
                }else{
                    isError = true;
                }
                break;
            //Temmuz
            case 7:
                if(day>=1 && day<=31) {
                    if (day < 23) {
                        System.out.print("Burcunuz YENGEÇ!");
                    } else {
                        System.out.print("Burcunuz ASLAN!");
                    }
                }else{
                    isError = true;
                }
                break;
            //Ağustos
            case 8:
                if(day>=1 && day<=31) {
                    if (day < 23) {
                        System.out.print("Burcunuz ASLAN!");
                    } else {
                        System.out.print("Burcunuz BAŞAK!");
                    }
                }else{
                    isError = true;
                }
                break;
            //Eylül
            case 9:
                if(day>=1 && day<=30) {
                    if (day < 23) {
                        System.out.print("Burcunuz BAŞAK!");
                    } else {
                        System.out.print("Burcunuz TERAZİ!");
                    }
                }else{
                    isError = true;
                }
                break;
            //Ekim
            case 10:
                if(day>=1 && day<=31) {
                    if (day < 22) {
                        System.out.print("Burcunuz TERAZİ!");
                    } else {
                        System.out.print("Burcunuz AKREP!");
                    }
                }else{
                    isError = true;
                }
                break;
            //Kasım
            case 11:
                if(day>=1 && day<=30) {
                    if (day < 22) {
                        System.out.print("Burcunuz AKREP!");
                    } else {
                        System.out.print("Burcunuz YAY!");
                    }
                }else{
                    isError = true;
                }
                break;
            //Aralık
            case 12:
                if(day>=1 && day<=31) {
                    if (day < 22) {
                        System.out.print("Burcunuz YAY!");
                    } else {
                        System.out.print("Burcunuz OĞLAK!");
                    }
                }else{
                    isError = true;
                }
                break;
            default:
                isError = true;


        }
        if(isError) {
            System.out.println("Hatalı bir tarih girdiniz.");
        }
    }
}