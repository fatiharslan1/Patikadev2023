import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double kg, m , vucutKitleIndeksi;

        Scanner in =new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        m = in.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kg = in.nextDouble();

        vucutKitleIndeksi = kg / (m*m);

        System.out.println("Vücut Kitle İndeksiniz : "+ vucutKitleIndeksi);
    }
}