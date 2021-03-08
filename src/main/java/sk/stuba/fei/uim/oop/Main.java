package sk.stuba.fei.uim.oop;

public class Main {

    public static void main(String[] args) {
        Contact contact = new Contact("Jakub", "Kovar");
        var contact2 = new Contact("Martin", "Kranec");
        var cislo = 5;
        cislo = contact2;
    }
}
