package Creational.Factory;

public class Blog extends Website{
    @Override
    public void createWebsite() {
        pages.add(new ConcatPage());
    }
}
