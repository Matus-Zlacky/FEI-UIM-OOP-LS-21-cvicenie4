package sk.stuba.fei.uim.oop;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        var zoznam = new LinkedList<Znamy>();
        zoznam.add(new NoZnamy());
        zoznam.add(new Graduate("Ing.", "Tomas", "Kovacik"));
        zoznam.add(1, new NoZnamy());
        System.out.println(zoznam.size());
        zoznam.add(new NoZnamy());
        zoznam.remove(1);
    }
}
