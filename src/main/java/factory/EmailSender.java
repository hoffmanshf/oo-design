package factory;

public class EmailSender implements Sender {
    public void send() {
        System.out.println("Send email message");
    }
}
