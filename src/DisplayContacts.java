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
        System.out.println("Name | Phone Number");
        System.out.println("-------------------");
        int[][] matrix = {
                { }
        };
        System.out.print("| ");

        int[] row = new int[0];
        for (int n : row) {
            System.out.print(n + " | ");
        }

        System.out.println();
        for (String s : ContactsList) {
            System.out.println(s);
        }
        return false;
    }
}

