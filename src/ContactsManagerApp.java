import java.io.IOException;

public class ContactsManagerApp {

    public static void main(String[] args) throws IOException {

        System.out.println(DisplayContacts.ShowAllContacts());
//        System.out.println(SearchContacts.searchContact());
//        System.out.println(AddContacts.addDelete());
        System.out.println(DeleteContacts.addDelete());

    }

}
