import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AddContacts {

    // this is where the user will add
    public static boolean add() throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = scanner.next();
        System.out.println("Enter last name: ");
        String lastName = scanner.next();
        System.out.println("Enter number: ");
        String Number = scanner.next();
        String number = Number.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");

        List<String> SearchContacts = Files.readAllLines(Paths.get("src", "Contacts.txt"));

        Files.write(
                Paths.get("src", "Contacts.txt"), Arrays.asList(firstName + " " + lastName + " | " + number),
                StandardOpenOption.APPEND
        );
        return false;
    }
}
