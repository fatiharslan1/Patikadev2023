import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
      /*
        System.out.print("Enter a number : ");
        int number = in.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int result = 0;
        int basPow;

        while( tempNumber !=0){
            tempNumber/=10;
            basNumber++;
        }


        tempNumber = number;
        while ((tempNumber != 0)) {

            basValue = tempNumber %10;
            basPow =1;
            for(int i=1;i<= basNumber;i++){
                basPow *=basValue;
            }
            result += basPow;
            tempNumber /=10;
        }

        if(result==number){
            System.out.println( number + " is a armstrong number.");
        }else{
            System.out.println(number+ " is not a armstrong number.");
        }
        */
        // ödev

        System.out.println("################## ödev ##########################");

        System.out.print("Enter a number : ");
        int number = in.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int result = 0;
        int basPow;

        while( tempNumber !=0){
            tempNumber/=10;
            basNumber++;
        }


        tempNumber = number;
        while ((tempNumber != 0)) {

            basValue = tempNumber %10;
            basPow =1;
            for(int i=1;i<= basNumber;i++){
                basPow +=basValue;
            }
            result += basPow;
            tempNumber /=10;
        }
        System.out.println("Sum of nummber : "+ result);
    }
}