import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int yil;

        Scanner in = new Scanner(System.in);

        System.out.print("Yıl Giriniz : ");
        yil = in.nextInt();

        if(yil%4==0){
            System.out.println(yil + " bir artık yıldır !");
        }else {
            System.out.println(yil + " bir artık yıl değildir !");
        }
    }
}