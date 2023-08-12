import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int temp;

        System.out.print("Please enter a temp of your city : ");
        temp=in.nextInt();

        String tempValue;

        if(temp<0){
            tempValue="a";
        } else if (temp<20) {
            tempValue="b";
        } else if (temp<35) {
            tempValue ="c";
        }else {
            tempValue="d";
        }

        switch (tempValue){
            case "a":
                System.out.println("so cold!! Maybe Can you want to play snow :))");
                break;
            case "b":
                System.out.println("little bit cold! Maybe could you want to go to cafe..");
                break;
            case "c":
                System.out.println("Great wheather! Let's go to the park");
                break;
            case "d":
                System.out.println("so hot!!! You have to go to swim");
                break;
        }

    }
}