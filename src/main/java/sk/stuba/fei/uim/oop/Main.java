package sk.stuba.fei.uim.oop;

public class Main {

    public static void main(String[] args) {
        Contact contact = new Contact("Jakub", "Kovar");
        var contact2 = new Contact("Martin", "Kranec");
        var contact3 = new Contact("Tomas Kovacik");

        var contact4 = Contact.parseFromFullName("Gabriel Juhas");

        var contacts1 = new Contact[] {contact2, contact3, contact4};
        contact.setFriendsFromArray(contacts1);

        contacts1[0].setFirstName("Mato");

        contact.setFriends(contact4, contact2, contact3);

        contact3.setFirstName("Kovy");
    }
}
