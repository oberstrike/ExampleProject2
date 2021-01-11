package customers;

import customers.customers.CorporateCustomer;
import customers.customers.PrivateCustomer;
import customers.shop.Shop;

public class ShopMain {

    public static void main(String[] args) {
        Shop shop = new Shop();

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setCustomerId("RandomCorporateId");
        corporateCustomer.setCompanyName("GmBh");
        corporateCustomer.setCreditCardNumber("CreditCard1");
        corporateCustomer.setAddress("customer@gmbh.de");

        PrivateCustomer privateCustomer = new PrivateCustomer();
        privateCustomer.setCustomerId("RandomPrivateId");
        privateCustomer.setForename("Markus");
        privateCustomer.setName("Jürgens");
        privateCustomer.setCreditCardNumber("CreditCard2");
        privateCustomer.setAddress("markus.juergens@gmx.de");

        //Impliziertes Casting von CorporateCustomer zu Customer
        shop.addCustomer(corporateCustomer);

        //Impliziertes Casting von PrivateCustomer zu Customer
        shop.addCustomer(privateCustomer);

        int customerCount = shop.customerCount();
        System.out.printf("Es sind %d Kunden im Shop \n", customerCount);

        shop.customersPurchase();

        shop.printAllCustomerIds();


        customerCount = shop.customerCount();
        System.out.printf("Es sind %d Kunden im Shop \n", customerCount);

    }
}
