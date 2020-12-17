package customers.mail;

public abstract class AbstractAddressable implements Addressable {
    protected Integer messageSent;

    public AbstractAddressable(){
        this.messageSent = 0;
    }

    @Override
    public Integer getMessageSent() {
        return messageSent;
    }

    @Override
    public void setMessageSent(Integer messageSent) {
        this.messageSent = messageSent;
    }
}
