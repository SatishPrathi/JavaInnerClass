public class RunnableExample {
    
    public void runTask() {
        class Task implements Runnable {
            public void run() {
                System.out.println("Task is running...");
            }
        }
        
        Task task = new Task();
        new Thread(task).start();
    }
    
    public static void main(String[] args) {
        RunnableExample example = new RunnableExample();
        example.runTask();
    }
}
