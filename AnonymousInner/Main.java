interface MyInterface {
    void myMethod();
}

public class Main {
    public static void main(String[] args) {
        MyInterface myObject = new MyInterface() {
            public void myMethod() {
                System.out.println("Inside myMethod in anonymous inner class");
            }
        };

        myObject.myMethod();
    }
}
