package factory;

public class SmsSender implements Sender {
    public void send() {
        System.out.println("Send SMS message");
    }
}
