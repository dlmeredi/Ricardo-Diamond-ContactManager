import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DeleteContacts {

    // this is where the user will add and delete contacts
    public static boolean addDelete() throws IOException {

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();

        List<String> SearchContacts = Files.readAllLines(Paths.get("src", "Contacts.txt"));

        Files.write(
                Paths.get("src", "Contacts.txt"),
                Arrays.asList(userInput).remove(userInput);
        );

        //will continue this after we create functionality for search contacts!

        return false;
    }

}