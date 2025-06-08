package chx;

class Singleton {
        
        private Singleton() {}
        
        public static Singleton getInstance(){
            return new Singleton();
        }
    }
public class Main {
    
    private final int TEST = 10;
    
    
    public static void main(String[] args) {
        System.out.println("Look Below...");
        Singleton singleton = new Singleton();
        singleton.getInstance();
      
    }
}
