public class Outer {
    private int outerVar = 10;

    public void outerMethod() {
        class LocalInner {
            void display() {
                System.out.println("Outer Variable: " + outerVar);
            }
        }

        LocalInner localInner = new LocalInner();
        localInner.display();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.outerMethod();
    }
}
