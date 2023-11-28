public class DatabaseManager {
    
    public void connectToDatabase() {
        class DatabaseConnection {
            public void connect() {
                System.out.println("Connected to the database.");
            }
        }
        
        DatabaseConnection connection = new DatabaseConnection();
        connection.connect();
    }
    
    public static void main(String[] args) {
        DatabaseManager manager = new DatabaseManager();
        manager.connectToDatabase();
    }
}
