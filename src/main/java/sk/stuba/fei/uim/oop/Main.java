package sk.stuba.fei.uim.oop;

public class Main {

    public static void main(String[] args) {
        var absolvent = new Graduate("Ing.","Tomas", "Kovacik");

        absolvent.setFriends(new Graduate("Ing.","Martin", "Kranec"), new Graduate("Ing.","Jakub", "Kovar"));

        System.out.println(absolvent.akoText());
        System.out.println(absolvent.akoTextSTitulom());

        System.out.println(absolvent);
    }
}
