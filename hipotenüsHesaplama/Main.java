import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b;
        double c;

        // scanner sınıfını tanımladık
        Scanner inp = new Scanner(System.in);

        // kullanıcı dan değerleri alma
        System.out.print("Lütfen ilk kenarını giriniz : ");
        a = inp.nextInt();

        System.out.print("Lütfen ikinci kenarını giriniz : ");
        b = inp.nextInt();

        c = Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs : "+ c);


    }
}