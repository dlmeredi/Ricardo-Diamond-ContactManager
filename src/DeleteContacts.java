import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DeleteContacts {

    // this is where the user will add and delete contacts
    public static boolean addDelete() throws IOException {

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();

        List<String> lines = Files.readAllLines(Paths.get("src","Contacts.txt"));
        List<String> newList = new ArrayList<>();

        for(String line : lines) {
            if(line.equals(userInput)){
                newList.remove(" ");
            }
            newList.add(line);
            // Using .remove(index: ) will remove the contact place on the original list
            // Ex. if you put 'index:5' you'll remove the contact on line 5.
        }
        Files.write(Paths.get("src","Contacts.txt"),newList);

        //will continue this after we create functionality for search contacts!

        return false;
    }

}