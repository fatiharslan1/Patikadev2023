public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("A", 10, 120, 95, 40);
        Fighter f2 = new Fighter("B", 20, 100, 90, 45);

        Match match = new Match(f1, f2, 90, 95);
        match.run();

    }
}