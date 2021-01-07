package Creational.AbstractFactory;

public abstract class CreditCardFactory {
    /*
    * assume there is creditCard class (and its subclasses visa,mastercard)
    * also subclasses of the CreditCardFactory (VisaFactory, MasterFactory)
    * */

    public static CreditCardFactory getCreditCardFactory(int creditScore) {
        if (creditScore > 65){
            return new MasterCardFactory();
        } else {
            return new VisaFactory();
        }

    }

    public abstract CreditCard getCreditCard(CardType type);
}
