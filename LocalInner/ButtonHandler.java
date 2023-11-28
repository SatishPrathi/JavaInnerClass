public class ButtonHandler {
    
    public void addButtonListener() {
        class ButtonClickListener {
            public void onClick() {
                System.out.println("Button clicked!");
            }
        }
        
        ButtonClickListener listener = new ButtonClickListener();
        listener.onClick();
    }
    
    public static void main(String[] args) {
        ButtonHandler handler = new ButtonHandler();
        handler.addButtonListener();
    }
}
