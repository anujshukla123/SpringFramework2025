package SetterDI;


public class Test {

    private String name;
    private String emailID;
    private int age;

    public Test(String name, String emailID, int age) {
        this.name = name;
        this.emailID = emailID;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void printData(){
        System.out.println("Name:- "+name);
        System.out.println("Age- "+age);
        System.out.println("Email ID- "+emailID);
    }
}
