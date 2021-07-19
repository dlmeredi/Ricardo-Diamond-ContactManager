import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AddContacts {

    // this is where the user will add and delete contacts
    public static boolean add() throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String userInput = scanner.next();
        System.out.println("Enter number: ");
        String number = scanner.nextLine();
        Contact newContact = new Contact(userInput, number);
        List<String> SearchContacts = Files.readAllLines(Paths.get("src", "Contacts.txt"));

        Files.write(
                Paths.get("src", "Contacts.txt"), Arrays.asList(userInput + " | " + number),
                StandardOpenOption.APPEND
        );

        //will continue this after we create functionality for search contacts!

        return false;
    }
}
