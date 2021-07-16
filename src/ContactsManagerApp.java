import java.io.IOException;

public class ContactsManagerApp {

    public static void main(String[] args) throws IOException {

        System.out.println(Contacts.ShowAllContacts());
        System.out.println(ContactDirectory.CreateDirectory());
    }

}
