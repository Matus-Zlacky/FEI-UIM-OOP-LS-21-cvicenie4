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

        for(int i = 0; i < zoznam.size(); i++) {
            System.out.println(zoznam.get(i).getZnamy());
        }

        for(Znamy prvok : zoznam) {
            System.out.println(prvok.getZnamy());
        }

        for(var prvok : zoznam) {
            System.out.println(prvok.getZnamy());
        }

        int i = 0;
        var iterator = zoznam.iterator();
        while (iterator.hasNext()) {
            var prvok = iterator.next();
            if (i < 1) {
                System.out.println(prvok.getZnamy());
            } else {
                iterator.remove();
            }
            i++;
        }


    }
}
