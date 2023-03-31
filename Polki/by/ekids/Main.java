package by.ekids;

public class Main implements FreshFruit {
    public static void main(String[] args) {
        Polka polka1 = new Polka("1", new String[]{"Помидоры", "Хурма", "Яблоки"}, 6, "Помидоры");
        PolkaPrinter PolkaPrinter = new PolkaPrinter(polka1);
        PolkaPrinter.printInfo();

        Polka Polka2 = new Polka("2", new String[]{"Груши", "Апельсины", "Лайм"}, 6, "Апельсины");
        PolkaPrinter.printInfo();

        freshFruit[] freshfruit = Polka.provideFreshFruits();
        for (int i = 0; i < freshfruit.length; i++) {
            if (freshfruit[i] != null) {
                System.out.println(freshfruit[i].getName());
            }
        }
    }
}