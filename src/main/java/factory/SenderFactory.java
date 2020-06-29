package factory;

public class SenderFactory {
    public static Sender produceSms(){
        return new SmsSender();
    }

    public static Sender produceEmail(){
        return new EmailSender();
    }

    public static Sender produceExpress() {
        return new ExpressSender();
    }
}
