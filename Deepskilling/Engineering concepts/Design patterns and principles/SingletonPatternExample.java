class Logger{
    private static Logger instance;

    private Logger(){
        
    }
    public static Logger getInstance(){
        if(instance == null){
            instance= new Logger();
        }
        return instance;
    }
}
class SingletonPatternExample {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        if (logger1==logger2) {
            System.out.println("Both logger1 and logger2 are the same instance.");
        }
        else{
            System.out.println("different instances.");
        }
    }
}