import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        int[] list = {56, 34, 1, 8, 101, -2, -33};

        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);
         */

        int number;
        Scanner in = new Scanner(System.in);
        System.out.print("Please, enter a number : ");
        number = in.nextInt();

        int[] list = {15,12,788,1,-1,-778,2,0};
        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        for (int i : list) {
            if (number > i && i > min) {
                min = i;
            }
            if (number < i && i < max) {
                max = i;
            }
        }

        System.out.println("Girilen Sayı : "+ number);
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);
    }
}