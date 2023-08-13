public class Main {
    
    public static void recursiveMethod(int n) {
        if (n <= 0) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        recursiveMethod(n - 5);
        System.out.println(n);
    }
    public static void main(String[] args) {
        recursiveMethod(15);

    }
}