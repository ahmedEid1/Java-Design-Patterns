package Creational.Factory;

public class FactoryDemo {
    public static void main(String[] args) {
        Website my_blog = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(my_blog.getPages());

        Website my_shop = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println(my_shop.getPages());
    }
}
