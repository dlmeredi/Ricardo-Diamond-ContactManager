import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class DisplayContacts {


    public static boolean ShowAllContacts() throws IOException {
        Path paths = Paths.get("src", "Contacts.txt");
        List<String> ContactsList = Files.readAllLines(paths);
        ContactsList.add("Contact.txt");
        for (int i = 0; i < ContactsList.size(); i++) {
            System.out.println(ContactsList.get(i));
        }
        return false;
    }



}

