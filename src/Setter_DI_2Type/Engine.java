package Setter_DI_2Type;


public class Engine {

    public Engine(){
        System.out.println("Engine");
    }
    private String modelYear;

    public void setModelYear(String modelYear){
        this.modelYear=modelYear;
    }
    public String getModelYear(){
        return modelYear;
    }
}
