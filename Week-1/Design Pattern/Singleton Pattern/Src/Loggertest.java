package logger;

public class LoggerTest {
public static void main(String[] args) {
Logger logger1 = Logger.getInstance();
logger1.log("App started.");

    Logger logger2 = Logger.getInstance();
    logger2.log("Another message.");

    if (logger1 == logger2) {
        System.out.println("Same logger instance used.");
    } else {
        System.out.println("Different logger instances. Singleton failed.");
    }
}
}