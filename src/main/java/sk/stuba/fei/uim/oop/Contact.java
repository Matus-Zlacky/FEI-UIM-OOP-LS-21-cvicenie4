package sk.stuba.fei.uim.oop;

public abstract class Contact implements Znamy {

    private String firstName;
    private String surname;

    protected Contact[] friends;

    public Contact(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }

    public Contact(String fullName) {
        var parts = fullName.split(" ");
        firstName = parts[0];
        surname = parts[1];
    }

    public Contact(Contact other) {
        this.firstName = other.firstName;
        this.surname = other.surname;
    }

    public void setFriends(Contact... newFriends) {
        this.friends = newFriends;
    }

    public void setFriendsFromArray(Contact[] newFriends) {
        this.friends = newFriends;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String akoText() {
        return String.format("%s %s", this.firstName, this.surname);
    }

    public abstract String getZnamy();

    @Override
    public String toString() {
        return String.format("Volam sa %s\n%s", this.akoText(), this.getZnamy());
    }
}
