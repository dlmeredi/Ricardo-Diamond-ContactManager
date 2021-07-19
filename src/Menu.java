import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static void Menu() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Menu: ");
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
                Menu.Menu();
                // brings the user back to the menu each time
            case "2":
                SearchContacts.searchContact();
                Menu.Menu();
                // allows the user to search for a contact
            case "3":
                AddContacts.add();
                Menu.Menu();
                // allows the user to add a contact
            case "4":
                DeleteContacts.Delete();
                Menu.Menu();
                // allow the user to delete a contact
            case "5":
                Menu.Menu();
                // back to the menu
            default:
                System.out.println( "Invalid input");
                // anything other than the options given
        }
    }
}
