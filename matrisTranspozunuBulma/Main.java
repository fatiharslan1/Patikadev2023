import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int listNumber1;
        int listNumber2;
        System.out.print("Array dimension n : ");
        listNumber1 = in.nextInt();

        System.out.print("Array dimension n : ");
        listNumber2 = in.nextInt();

        int list[][] = new int[listNumber1][listNumber2];

        for(int i = 0; i<listNumber1; i++){
            for(int j = 0; j<listNumber2; j++){
                list[i][j]=5;
            }
        }
        System.out.println("---Matris---");
        System.out.println(Arrays.deepToString(list));
        System.out.println("---Transpoze---");

        int list2[][] = new int[listNumber2][listNumber1];

        for(int i = 0; i<listNumber2; i++){
            for(int j = 0; j<listNumber1; j++){
                list2[i][j]=4;
            }
        }

        System.out.println(Arrays.deepToString(list2));
    }
}