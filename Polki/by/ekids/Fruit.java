package by.ekids;

enum freshFruit {
    Apple("Понедельник"),
    Lime("Вторник"),
    Oranges("Среда"),
    Pear("Четверг"),
    Persimmon("Пятница"),
    Tomato("Суббота");



    private String name;

    freshFruit(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

}