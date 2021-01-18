package Behavioral.Strategy;

public class AmxStrategy extends Strategy{
    @Override
    public boolean isValid(CreditCard creditCard) {
        //...do some validations
        return true;
    }
}
