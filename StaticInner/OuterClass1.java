public class OuterClass1 {
    private static int outerField = 10;

    static class StaticInnerClass {
        public void printOuterField() {
            System.out.println("Outer field from inner class: " + outerField);
        }
    }

    public static void main(String[] args) {
        OuterClass1.StaticInnerClass innerObj = new OuterClass1.StaticInnerClass();
        innerObj.printOuterField();
    }
}
