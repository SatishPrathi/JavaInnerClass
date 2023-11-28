public class OuterClass {
    private static int outerField = 10;

    static class StaticInnerClass {
        private int innerField = 5;

        public void printValues() {
            System.out.println("Outer field: " + outerField);
            System.out.println("Inner field: " + innerField);
        }
    }
    
    public static void main(String[] args) {
        OuterClass.StaticInnerClass innerObj = new OuterClass.StaticInnerClass();
        innerObj.printValues();
    }
}
