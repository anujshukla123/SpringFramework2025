package SampleDI;

public class Test {
    private String gender;

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void Hello(String name){

        System.out.println("Hello...."+gender+" "+name);
    }
}
