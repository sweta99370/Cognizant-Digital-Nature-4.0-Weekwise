public class LoggerTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("First log message.");

        if (logger1 == logger2) {
            System.out.println("Same instance - Singleton works.");
        } else {
            System.out.println("Different instances - Singleton failed.");
        }

        logger2.log("Second log message.");
    }
}
