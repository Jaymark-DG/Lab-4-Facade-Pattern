public class HomeApp {
    public static void main(String[] args) {
        // The client interacts only with the simplified Facade interface
        HomeInterface homeInterface = new HomeInterface();

        // Control all services simultaneously using single methods
        homeInterface.turnOnAll();
        
        System.out.println(); // Just a blank line for readability
        
        homeInterface.turnOffAll();
    }
}
