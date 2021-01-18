package Behavioral.Observer;

import java.util.ArrayDeque;
import java.util.Deque;

public class MessageStream extends Subject{
    private Deque<String> messageHistory = new ArrayDeque<>();



    @Override
    public void setState(String s) {
        messageHistory.add(s);
        this.notifyObservers();
    }

    @Override
    public String getState() {
        return messageHistory.getLast();
    }
}
