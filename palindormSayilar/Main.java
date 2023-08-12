public class Main {

    static boolean isPalindorm(int number){
        int temp = number, reverseNumber = 0, lastNumber;
        while(temp != 0){
            System.out.println("#############");
            System.out.println("Number => "+ temp);
            lastNumber = temp % 10;
            System.out.println("Last step => "+ lastNumber);
            reverseNumber = (reverseNumber * 10) + lastNumber;
            System.out.println("New number => "+ reverseNumber);
            temp /= 10;
        }
        if(number == reverseNumber) {
            return true;
        }else{
            return  false;
            }
    }
    public static void main(String[] args) {
        isPalindorm(241);
    }
}