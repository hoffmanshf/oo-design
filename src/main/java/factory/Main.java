package factory;

public class Main {
    public static void main(String[] args) {
        Sender senderEmail = SenderFactory.produceEmail();
        senderEmail.send(); // 发送邮件

        Sender senderSms = SenderFactory.produceSms();
        senderSms.send(); // 发送短信

        Sender senderExpress = SenderFactory.produceExpress();
        senderExpress.send(); // 发送快递
    }
}
