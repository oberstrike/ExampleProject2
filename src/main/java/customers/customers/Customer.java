package customers.customers;

import customers.cash.CreditInformations;
import customers.mail.AbstractAddressable;
/*
1. CreditInformations - package: cash
2. AbstractAddressable - package: mail
3. String

 */
public abstract class Customer extends AbstractAddressable implements CreditInformations {
    private String customerId;
    private String address;
    private String creditCardNumber;

    public Customer(){
        super();
    }

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
