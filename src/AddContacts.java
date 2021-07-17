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
    public static boolean addDelete() throws IOException {

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();

        List<String> SearchContacts = Files.readAllLines(Paths.get("src", "Contacts.txt"));

        Files.write(
                Paths.get("src", "Contacts.txt"), Arrays.asList(userInput),
                StandardOpenOption.APPEND
        );

        //will continue this after we create functionality for search contacts!

        return false;
    }

    public static List<String>CreateContact(){
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
        List<String> createNewContact = new ArrayList<>();
        System.out.println("Please create a new contact: ");
        createNewContact.add(userInput);

        return createNewContact;
    }

}
