abstract class Shape {
    abstract void draw();
}

public class DrawExample {
    public static void main(String[] args) {
        Shape shape = new Shape() {
            void draw() {
                System.out.println("Drawing a shape with anonymous inner class");
            }
        };

        shape.draw();
    }
}
