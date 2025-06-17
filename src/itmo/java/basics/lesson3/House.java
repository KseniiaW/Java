package itmo.java.basics.lesson3;

public class House {
    private int floors;
    private int buildYear;
    private String name;

    public void setHouseData(int floors, int buildYear, String name) {
        this.floors = floors;
        this.buildYear = buildYear;
        this.name = name;
    }

    public void printHouseInfo() {
        System.out.println("Дом: " + name);
        System.out.println("Этажей: " + floors);
        System.out.println("Год постройки: " + buildYear);
        System.out.println("Лет с момента постройки: " + getYears());
        System.out.println();
    }

    // рассчет лет с момента постройки
    public int getYears() {
        return java.time.Year.now().getValue() - buildYear;
    }
}

