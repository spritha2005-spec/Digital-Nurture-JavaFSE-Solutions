public class Logger {

    private static Logger logger = new Logger();

    private Logger() {
    }

    public static Logger getInstance() {
        return logger;
    }

    public void display() {
        System.out.println("Logger object created");
    }
}