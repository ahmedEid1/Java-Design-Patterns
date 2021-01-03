package Creational.Singleton;

public class DbSingletonTester {
    public static void main(String[] args) {
        DbSingleton instance = DbSingleton.getInstance();
        DbSingleton instance1 = DbSingleton.getInstance();

        if (instance == instance1)
            System.out.println("they are the same object ^_^");
    }
}
