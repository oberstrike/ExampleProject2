package customers.mail;

import customers.Shop;

public class MailRoom {

    private final Addressable shop;

    public MailRoom(Addressable shop) {
        this.shop = shop;
    }

    public void sendMessageTo(Addressable addressable, String paymentId) {
        Mail mail = new Mail(addressable, shop);
        mail.sendMessage(getMessage(paymentId));
    }

    private String getMessage(String paymentId) {
        return "PaymentId: " + paymentId;
    }

}
