import java.util.Scanner;
public class passport {
    public static void scanPass() {
        String PASSPORT = "Let me in";

        System.out.println("Enter your password: ");
        Scanner passwordScanner = new Scanner(System.in);
        while (true) {
            String passport = passwordScanner.nextLine();
            // String.
            if (passport.length() > 15 || passport.length() == 0 || !passport.equals(PASSPORT)) {
                System.out.println("Incorrect input\nEnter your password: ");
            } else {
                System.out.println("Grant access!!!");
                passwordScanner.close();
                break;
            }
        }
    }
    public static void main(String[] args) {
        scanPass();
    }
}
