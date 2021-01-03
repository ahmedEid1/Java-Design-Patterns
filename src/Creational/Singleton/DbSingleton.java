package Creational.Singleton;
/*
 * a singleton to manage who have access to creat connection to a database and where they can create them
 * */
public class DbSingleton {
    private static volatile DbSingleton instance;
    private DbSingleton() {
        if (instance != null)
            throw new RuntimeException("use getInstanceMethod to create a singleton");
    }

    public static DbSingleton getInstance() {
        if (instance == null){
            // happen just in the creation process instead of synchronizing the method every time
            synchronized (DbSingleton.class) {
                if (instance == null)
                    instance = new DbSingleton();
            }
        }
        return instance;
    }
}
