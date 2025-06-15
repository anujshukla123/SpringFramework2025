package beans.Test;

public class Test {

    private Test() {
        System.out.println("private constructor access");
    }

    private void hello(){

        System.out.println("Hello World");
    }
    public void eagerLoading(){

        System.out.println("eagerLoading");
    }
}
