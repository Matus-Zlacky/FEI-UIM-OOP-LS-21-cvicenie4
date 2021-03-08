package sk.stuba.fei.uim.oop;

public class Contact {

    private String firstName;
    private String surname;

    private Contact[] friends;

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

    public static Contact parseFromFullName(String fullName) {
        return new Contact(fullName);
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

    public Contact[] getFriends() {
        var friendsClone = new Contact[this.friends.length];
        for(int i = 0; i < this.friends.length; i++) {
            friendsClone[i] = new Contact(this.friends[i]);
        }
        return friendsClone;
    }
}
