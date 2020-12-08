package customers;

public class MailRoom {

    public void sendMessageTo(Addressable addressable, String paymentId) {
        String targetAddress = addressable.getAddress();
        System.out.printf("Sending the message: [PaymentId: %s] to %s... \n", paymentId, targetAddress);
    }

}
