public class OuterClass3 {
    private static int outerField = 10;

    static class StaticInnerClass {
        private int innerField;

        public StaticInnerClass(int value) {
            this.innerField = value;
        }

        public void printValues() {
            System.out.println("Outer field: " + outerField);
            System.out.println("Inner field: " + innerField);
        }
    }

    public static void main(String[] args) {
        OuterClass3.StaticInnerClass innerObj = new OuterClass3.StaticInnerClass(7);
        innerObj.printValues();
    }
}
