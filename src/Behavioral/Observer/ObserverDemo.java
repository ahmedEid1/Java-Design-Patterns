package Behavioral.Observer;

public class ObserverDemo {
    public static void main(String[] args) {
        Subject subject = new MessageStream();

        Observer phoneClient = new PhoneClient(subject);

        subject.setState("hello there");
    }
}
