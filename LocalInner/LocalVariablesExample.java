public class LocalVariablesExample {
    
    public void printNumbers() {
        final int multiplier = 2;
        
        class MultiplierPrinter {
            public void print(int num) {
                System.out.println("Result: " + (num * multiplier));
            }
        }
        
        MultiplierPrinter printer = new MultiplierPrinter();
        printer.print(5);
    }
    
    public static void main(String[] args) {
        LocalVariablesExample example = new LocalVariablesExample();
        example.printNumbers();
    }
}
