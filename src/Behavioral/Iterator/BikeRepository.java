package Behavioral.Iterator;

import java.util.Iterator;
import java.util.function.Consumer;

public class BikeRepository implements Iterable<String>{
    private String[] bikes;
    private int index;

    public BikeRepository() {
        bikes = new String[10];
        index = 0;
    }


    public void addBike(String bike) {
        bikes[index] = bike;
        index++;
    }

    @Override
    public Iterator<String> iterator() {
        Iterator<String> it = new Iterator<String>(){
            private int curIndex;
            @Override
            public boolean hasNext() {
                return curIndex < bikes.length && bikes[curIndex] != null;
            }

            @Override
            public String next() {
                return bikes[curIndex++];
            }

            @Override
            public void remove() {
                bikes[curIndex] = null;
            }

        };

        return it;
    }
}
