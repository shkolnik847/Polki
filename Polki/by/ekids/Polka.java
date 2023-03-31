package by.ekids;

public class Polka implements FreshFruit {

    public static final String pattern = "На полке лежат @d видов овощей";
    private String number;
    public int getCollectionSize() {
        return collectionSize;
    }

    public void setCollectionSize(int collectionSize) {
        this.collectionSize = collectionSize;
    }

    private int collectionSize;
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    private String[] department;

    public String[] getDepartment() {
        return department;
    }

    public void setDepartment(String[] department) {
        this.department = department;
    }
    private freshFruit badFruit;  //!!freshFruit

    public freshFruit getBadFruit() {
        return badFruit;
    }
    public Polka(String number, String[] department, int collectionSize, freshFruit badFruit) {
        this.number = number;
        this.collectionSize = collectionSize;
        this.department = department;
        this.badFruit = badFruit;

        @Override
        public freshFruit[] provideFreshFruits() {  //!!values
            freshFruit[] range = freshFruit.values();
            freshFruit[] values = new freshFruit[range.length];
            for (int i = 0; i < range.length; i++) {
                if(range[i] != badFruit) {
                    values[i] = range[i];
                }
            }
        }
}
}

