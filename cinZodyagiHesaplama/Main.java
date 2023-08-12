import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int dogumYili, zodyakSaysı;
        String zodyakHayvani = "";

        Scanner in = new Scanner(System.in);

        System.out.println("Hoşgeldiniz...");
        System.out.print("Lütfen doğum yılınızı giriniz : ");
        dogumYili = in.nextInt();

        zodyakSaysı = dogumYili % 12;

        switch (zodyakSaysı){
            case 0:
                zodyakHayvani = "Maymun";
                break;
            case 1:
                zodyakHayvani = "Horoz";
                break;
            case 2:
                zodyakHayvani = "Köpek";
                break;
            case 3:
                zodyakHayvani = "Domuz";
                break;
            case 4:
                zodyakHayvani = "Fare";
                break;
            case 5:
                zodyakHayvani = "Öküz";
                break;
            case 6:
                zodyakHayvani = "Kaplan";
                break;
            case 7:
                zodyakHayvani = "Tavşan";
                break;
            case 8:
                zodyakHayvani = "Ejderha";
                break;
            case 9:
                zodyakHayvani = "Yılan";
                break;
            case 10:
                zodyakHayvani = "At";
                break;
            case 11:
                zodyakHayvani = "Koyun";
                break;
        }

        System.out.println("Çin Zodyağı Burcunuz : "+ zodyakHayvani);
    }
}