import java.util.Scanner;
public class LibrarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n== Library System ==\n");
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");
            System.out.print("Choose option (1-3): ");

            // Validate user input
            int option = readOption(scanner);

            switch (option) {
                case 1:
                    loginStudent(scanner);
                    break;
                case 2:
                    loginAdmin(scanner);
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    private static int readOption(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a number: ");
            scanner.next(); // consume the invalid input
        }
        return scanner.nextInt();
    }

    private static void loginStudent(Scanner scanner) {
        System.out.println("\n===== Student Login =====\n");
        System.out.print("Enter your NIM (Nomor Induk Mahasiswa): ");
        String nim = scanner.nextLine();

        if (nim.length() == 15) {
            System.out.println("Successful Login as Student");
        } else {
            System.out.println("Invalid NIM. It should be 15 characters long.");
        }
    }

    private static void loginAdmin(Scanner scanner) {
        System.out.println("\n===== Admin Login =====\n");
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        // You should implement proper authentication logic here
        if (username.equals("admin") && password.equals("admin")) {
            System.out.println("Successful Login as Admin");
        } else {
            System.out.println("Admin Not Found");
        }
    }
}

