public class CommitCafe {

    private static String barista = "Thomas";
    private static String nickname = "Tom";
    private static int cups = 0;

    public static void brew(String drink) {
        cups++;
        System.out.println("One " + drink + " coming up!");
        System.out.println("[BOT CHECK] drink length = " + drink.length() + "\n");
    }

    public static void printSummary() {
        System.out.println("[SUMMARY] " + barista + " brewed " + cups + " cups today.");
    }

    public static void main(String[] args) {
        brew("Espresso");
        brew("Latte");
        printSummary();
    }
}