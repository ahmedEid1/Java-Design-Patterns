package Behavioral.Strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        CreditCard amxCard = new CreditCard(new AmxStrategy());

        amxCard.setNumber("38u987349875");
        amxCard.setDate("12/32/2222");
        amxCard.setCVV("122");

        System.out.println(amxCard.isValid());
    }
}
