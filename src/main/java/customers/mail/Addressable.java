package customers.mail;

public interface Addressable {
    String getAddress();

    Integer getMessageSent();
    void setMessageSent(Integer messageSent);
}

