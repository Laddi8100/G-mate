import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AuthService authService = new AuthService();

        // Hardcoded signup tests
        System.out.println("Signup user1: " + authService.signup("user1", "pass1"));
        System.out.println("Signup user2: " + authService.signup("user2", "pass2"));
        System.out.println("Signup user1 again: " + authService.signup("user1", "pass123")); // should fail

        // Hardcoded login tests
        System.out.println("Login user1 with correct password: " + authService.login("user1", "pass1"));
        System.out.println("Login user2 with wrong password: " + authService.login("user2", "wrongpass"));
        System.out.println("Login non-existing user: " + authService.login("user3", "pass3"));

        // Interactive input section
        Scanner sc = new Scanner(System.in);

        System.out.print("\n--- Interactive Signup ---\nEnter username: ");
        String user = sc.nextLine();

        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        System.out.println("Signup result: " + authService.signup(user, pass));

        System.out.print("\n--- Interactive Login ---\nEnter username: ");
        String loginUser = sc.nextLine();

        System.out.print("Enter password: ");
        String loginPass = sc.nextLine();

        System.out.println("Login result: " + authService.login(loginUser, loginPass));

        sc.close();
    }
}