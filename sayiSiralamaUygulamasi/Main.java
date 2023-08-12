import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sayi1, sayi2, sayi3;

        Scanner in = new Scanner(System.in);

        System.out.println("Hoşgeldiniz...");
        System.out.print("1. sayıyı giriniz : ");
        sayi1 = in.nextInt();

        System.out.print("2. sayıyı giriniz : ");
        sayi2 = in.nextInt();

        System.out.print("3. sayıyı giriniz : ");
        sayi3 = in.nextInt();

        if((sayi1>sayi2) && (sayi1>sayi3)){
            if(sayi2>sayi3){
                System.out.println("Sıralama...");
                System.out.println("Sayi1 > Sayi2 > Sayi3");
            }else{
                System.out.println("Sıralama...");
                System.out.println("Sayi1 > Sayi3 > Sayi2");
            }
        } else if ((sayi2>sayi1) && (sayi2>sayi3)) {
            if(sayi1>sayi3){
                System.out.println("Sıralama...");
                System.out.println("Sayi2 > Sayi1 > Sayi3");
            }else{
                System.out.println("Sıralama...");
                System.out.println("Sayi2 > Sayi3 > Sayi1");
            }
        }else if ((sayi3>sayi1) && (sayi3>sayi2)) {
            if(sayi1>sayi2){
                System.out.println("Sıralama...");
                System.out.println("Sayi3 > Sayi1 > Sayi2");
            }else{
                System.out.println("Sıralama...");
                System.out.println("Sayi3 > Sayi2 > Sayi1");
            }
        }
    }
}