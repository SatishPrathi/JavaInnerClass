interface Greeting {
    void greet();
}

public class GreetExample {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            public void greet() {
                System.out.println("Hello from anonymous inner class!");
            }
        };

        greeting.greet();
    }
}
