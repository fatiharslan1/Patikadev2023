import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int mat1, mat2, fizik1, fizik2, turkce1, turkce2,kimya1,kimya2,muzik1,muzik2;
        double ortalama, matOrt, fizikOrt, turkceOrt,kimyaOrt,muzikOrt;
        String karar;

        System.out.println("Hoşgeldiniz!!");

        System.out.print("Matematik 1. sınav notunuzu giriniz : ");
        mat1 = in.nextInt();

        System.out.print("Matematik 2. sınav notunuzu giriniz : ");
        mat2 = in.nextInt();

        System.out.println("#################################");

        System.out.print("Fizik 1. sınav notunuzu giriniz : ");
        fizik1 = in.nextInt();

        System.out.print("Fizik 2. sınav notunuzu giriniz : ");
        fizik2 = in.nextInt();

        System.out.println("#################################");

        System.out.print("Türkçe 1. sınav notunuzu giriniz : ");
        turkce1 = in.nextInt();

        System.out.print("Türkçe 2. sınav notunuzu giriniz : ");
        turkce2 = in.nextInt();

        System.out.println("#################################");

        System.out.print("Kimya 1. sınav notunuzu giriniz : ");
        kimya1 = in.nextInt();

        System.out.print("Kimya 2. sınav notunuzu giriniz : ");
        kimya2 = in.nextInt();

        System.out.println("#################################");

        System.out.print("Müzik 1. sınav notunuzu giriniz : ");
        muzik1 = in.nextInt();

        System.out.print("Müzik 2. sınav notunuzu giriniz : ");
        muzik2 = in.nextInt();

        matOrt= (mat1+mat2)/2;
        fizikOrt =(fizik1+fizik2)/2;
        turkceOrt =(turkce1+turkce2)/2;
        kimyaOrt =(kimya1+kimya2)/2;
        muzikOrt =(muzik1+muzik2)/2;
        ortalama=(matOrt+fizikOrt+turkceOrt+kimyaOrt+muzikOrt)/5;

        if(ortalama>=55){
            karar="Geçtiniz";
        }else{
            karar="Kaldınız";
        }

        System.out.println("#################################");
        System.out.println("Matematik ortalamanız : " + matOrt);
        System.out.println("Fizik ortalamanız : " + fizikOrt);
        System.out.println("Türkçe ortalamanız : " + turkceOrt);
        System.out.println("Kimya ortalamanız : " + kimyaOrt);
        System.out.println("Müzik ortalamanız : " + muzikOrt);
        System.out.println("Genel ortalamanız : " + ortalama+ " "+ karar);
        System.out.println("#################################");

    }
}