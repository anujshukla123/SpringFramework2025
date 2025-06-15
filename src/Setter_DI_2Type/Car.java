package Setter_DI_2Type;

public class Car {
    public Car(){
        System.out.println("Car");
    }
    private String carName;
    private Engine engine;


    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public void printCarData(){
        System.out.println("CarName "+carName);
        System.out.println("Model Year "+ engine.getModelYear());

    }
}
