import java.io.IOException;
import java.util.Scanner;

public class Menu {
//    private Scanner scanner;
//    String userInput = scanner.nextLine();


    public static void Menu() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. View contacts.\n" +
                "2. Search a contact by name.\n" +
                "3. Add a new contact.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n" +
                "Enter an option (1, 2, 3, 4 or 5):");
        String userInput = scanner.nextLine();
        switch (userInput) {
            case "1":
                DisplayContacts.ShowAllContacts();
            case "2":
                SearchContacts.searchContact();
            case "3":
                AddContacts.add();
            case "4":
                DeleteContacts.Delete();
            case "5":
                Menu.Menu();
            default:
                System.out.println( "Invalid input");
        }
    }
}