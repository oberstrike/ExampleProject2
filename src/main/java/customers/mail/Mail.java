package customers.mail;

public class Mail {
    private Addressable targetAddress;
    private Addressable sourceAddress;

    public Mail(Addressable targetAddress, Addressable sourceAddress) {
        this.targetAddress = targetAddress;
        this.sourceAddress = sourceAddress;
    }

    public void sendMessage(String message, String code) {
        System.out.println("Senden der Nachricht: " + message + " von " + sourceAddress.getAddress() + " an " + targetAddress.getAddress());
        targetAddress.setMessageSent(targetAddress.getMessageSent() + 1);
        sourceAddress.setMessageSent(sourceAddress.getMessageSent() + 1);

    }
}
