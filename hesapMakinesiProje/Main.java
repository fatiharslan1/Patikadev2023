import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1, n2, select;

        Scanner in = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz : ");
        n1 = in.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        n2 = in.nextInt();

        System.out.println("1-Toplam\n2-Çıkartma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        select = in.nextInt();

        switch (select){
            case 1:
                System.out.println("İşlem sonucunuz : "+ (n1+n2));
                break;
            case 2:
                System.out.println("İşlem sonucunuz : "+ (n1-n2));
                break;
            case 3:
                System.out.println("İşlem sonucunuz : "+ (n1*n2));
                break;
            case 4:
                System.out.println("İşlem sonucunuz : "+ (n1/n2));
                break;
        }

    }
}