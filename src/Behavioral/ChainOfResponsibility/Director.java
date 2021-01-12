package Behavioral.ChainOfResponsibility;

public class Director extends Handler{
    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.CONFERENCE){
            System.out.println("dir. can approve of this");
        } else {
            successor.handleRequest(request);
        }
    }
}
