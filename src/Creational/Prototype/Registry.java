package Creational.Prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String, Item> items = new HashMap<>();

    public Registry() {
        loadItems();
    }

    public Item createItem(String type){
        Item item = null;

        try {
            item = (Item) (items.get(type)).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return item;
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("my movie");
        movie.setPrice(23.3);
        movie.setRuntime(3.2);
        items.put("Movie", movie);

        Book book = new Book();
        book.setTitle("my book");
        book.setPrice(2113.3);
        book.setNumOfPages(34);
        items.put("Book", book);

    }
}
