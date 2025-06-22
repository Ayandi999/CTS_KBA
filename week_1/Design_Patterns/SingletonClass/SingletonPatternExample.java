package Design_Patterns.SingletonClass;

class Logger{
     //Private static instance of class logger itself
     private static Logger instance;
     //Private constructor to ensure noone can create a object of this class
     private Logger(){
          System.out.println("Logger  Initialised");
     }

     public static Logger LoggerInstance(){
          //If thsi is the first call:
          if(instance == null) instance = new Logger();
          //If instance is alredy created then just send the instance back
          return instance;
     }

     public void printMessage(String message){
          System.out.println("Current Log:"+message);
     }
}

class Test{
     public static void main(String[] args) {
          /*Logger logger= new Logger();
          The above code creates problems as the constructor logger is not vissible*/
          Logger logger1=Logger.LoggerInstance();
          logger1.printMessage("I have successfully implimented the logger class");
          Logger logger2 = Logger.LoggerInstance();
          logger2.printMessage("Using the same logger object.");
          //Showing that both the loggers are the same and no new logger class object was created.
          System.out.println(logger1==logger2);
     }
}