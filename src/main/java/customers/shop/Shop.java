package customers.shop;

import customers.cash.CashDesk;
import customers.cash.CreditInformations;
import customers.customers.Customer;
import customers.mail.AbstractAddressable;
import customers.mail.MailRoom;

import java.util.ArrayList;
import java.util.List;

public class Shop extends AbstractAddressable implements CreditInformations {


    private final List<Customer> customers = new ArrayList<>();

    private final MailRoom mailRoom = new MailRoom(this);

    private final CashDesk cashDesk = new CashDesk(this);

    private final List<String> allCustomerIds = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public int customerCount() {
        return customers.size();
    }

    public void customersPurchase() {
        for (Customer customer : customers) {
            String paymentId = cashDesk.processPayments(customer);
            mailRoom.sendMessageTo(customer, paymentId);
            allCustomerIds.add(customer.getCustomerId());
        }

        while (customers.size() > 0){
            customers.remove(0);
        }
    }

    public void printAllCustomerIds(){
        for (String id : allCustomerIds){
            System.out.println("Es wurde der Kunde " + id + " bedient.");
        }
    }

    @Override
    public String getAddress() {
        return "shop@tk.de";
    }

    @Override
    public String getCreditCardNumber() {
        return "CreditCardShop1";
    }



}
