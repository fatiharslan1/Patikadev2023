import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int listNumber;
        System.out.print("Dizinin boyutu n : ");
        listNumber = in.nextInt();

        int list[] = new int[listNumber];

        for(int i = 0; i <= list.length-1; i++){
            System.out.print(i+". Elemanı : ");
            list[i]= in.nextInt();
        }

        Arrays.sort(list);
        System.out.println("Sıralama : "+Arrays.toString(list));

    }
}