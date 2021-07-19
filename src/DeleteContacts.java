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
    public static boolean Delete() throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Which contact do you want to delete?");
        String userInput = scanner.nextLine();

        List<String> lines = Files.readAllLines(Paths.get("src","Contacts.txt"));
        List<String> newList = new ArrayList<>();

        for(String line : lines) {
            if(line.contains(userInput)){
                newList.remove(userInput);
                continue;
            } else if(line.isEmpty()){
                System.out.println("invalid input");
                Delete();
            }
            newList.add(line);
            Files.write(Paths.get("src","Contacts.txt"),newList);
        }
        return false;
    }

}