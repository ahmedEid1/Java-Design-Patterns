package Behavioral.Iterator;

import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        BikeRepository repo = new BikeRepository();

        repo.addBike("bike1");
        repo.addBike("bike2");
        repo.addBike("bike3");

        Iterator<String> bikeIterator = repo.iterator();

        for (String s : repo)
            System.out.println(s);

        for (Iterator<String> it = bikeIterator; it.hasNext(); ) {
            String s = it.next();
            System.out.println(s);
        }
    }
}
