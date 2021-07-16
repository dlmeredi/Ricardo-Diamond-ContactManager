import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SearchContacts {

    public static boolean searchContact() throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Search for a name: ");
        // this prompts the user
        String userInput = scanner.next();
        // allows user to enter their input
        List<String> SearchContacts = Files.readAllLines(Paths.get("src", "Contacts.txt"));
        // ^^^ use this as a reference for add & remove functionality

        for (String SearchContact : SearchContacts) {
            if (SearchContact.contains(userInput)) {
                System.out.println(SearchContact);
            }
        }

return false;
        // we will change the return false later, don't leave this in here!!
    }


}
