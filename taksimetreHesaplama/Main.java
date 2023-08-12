import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double km;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz :  ");
        km = input.nextInt();

        double tutar;
        tutar = 10 + km * 2.20;

        if(tutar<20){
            tutar = 20;
        }
        //total = (total<20) ? 20 : total;
        System.out.println("Ödemeniz gereken ücret : "+ tutar +"TL");


    }

}