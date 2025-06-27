package itmo.java.basics.lesson6;

public class Truck extends Car {
    private int wheelsCount;
    private float maxWeight;

    public Truck(int weight, String model, char color, float speed,
                 int wheelsCount, float maxWeight) {
        super(weight, model, color, speed);
        this.wheelsCount = wheelsCount;
        this.maxWeight = maxWeight;
    }

    public void newWheels(int wheelsCount) {
        this.wheelsCount = wheelsCount;
        System.out.println("Новое количество колес: " + this.wheelsCount);
    }

    @Override
    public void outPut() {
        super.outPut();
        System.out.println("Количество колес: " + wheelsCount +
                ", максимальный вес: " + maxWeight);
    }
}