package customers;

public abstract class Customer implements Addressable, CreditInformations {
    private String customerId;
    private String address;
    private String creditCardNumber;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getCreditCardNumber() {
        return creditCardNumber;
    }
}

