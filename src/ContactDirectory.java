import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


// This is where you will search the contact by name

public class ContactDirectory {

    public static Path getPath(String file) {
        return Paths.get(file);
    }

    public static Path getPath(String Directory, String file) {
        return Paths.get(Directory, file);
    }

    public static boolean doesPathExist(Path path) {
        return Files.exists(path);
    }

    public static void CreateDirectory(Path pathToCreate) {
        if (!doesPathExist(pathToCreate)) {
            try {
                Files.createDirectory(pathToCreate);
            } catch (IOException e) {
                System.out.println("Could not create the directory at: ");
                System.out.println(pathToCreate.toAbsolutePath());
            }
        } else {
            System.out.println("The path at: " + pathToCreate.toAbsolutePath() + " does exists");
        }
    }

}


//}
