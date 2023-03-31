package by.ekids;

import static by.ekids.Polka.pattern;

public class PolkaPrinter {

    private static Polka polka;

    public PolkaPrinter(Polka polka) {
        this.polka = polka;
    }

    public static void printInfo() {
        System.out.println("Полка номер " + polka.getNumber());
        System.out.println("На полке лежит " + polka.getCollectionSize() + " фруктов");
        System.out.println("На полке лежат:");
        for (int i = 0; i < polka.getDepartment().length; i++) {
            System.out.print(polka.getDepartment()[i] + " ");
        }
        System.out.println("\n");
        System.out.printf(pattern, 6);
    }
}