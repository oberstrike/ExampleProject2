package customers.mail;

/*
Abhängigkeiten:
1. String - Stabil
2. Mail - Selbstkontrolle
3. Addressable
 */

public class MailRoom {

    private final Addressable shop;

    public MailRoom(Addressable shop) {
        this.shop = shop;
    }

    public void sendMessageTo(Addressable addressable, String paymentId) {
        Mail mail = new Mail(addressable, shop);
        mail.sendMessage(getMessage(paymentId), "1234");
    }

    private String getMessage(String paymentId) {
        return "PaymentId: " + paymentId;
    }

}
