package Behavioral.Observer;

public class PhoneClient extends Observer {
    public PhoneClient(Subject subject){
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    void update() {
        System.out.println("PhoneClientUpdated");
    }
}
