package Creational.Factory;

public class WebsiteFactory {
    public static Website getWebsite(WebsiteType siteType){
        return switch (siteType) {
            case BLOG -> new Blog();
            case SHOP -> new Shop();
        };
    }
}
