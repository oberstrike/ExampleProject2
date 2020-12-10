package customers;

public class MailRoom extends Shop {

    private final Shop shop;

    public MailRoom(Shop shop){
        this.shop = shop;
    }

    public void sendMessageTo(Addressable addressable, String paymentId) {
        String targetAddress = addressable.getAddress();
        System.out.printf("Sending the message: [PaymentId: %s] to %s... \n", paymentId, targetAddress);
    }

    public Shop getShop() {
        return shop;
    }
}
