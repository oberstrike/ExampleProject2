package customers.cash;

public class CashDesk {

    private final CreditInformations shop;

    public CashDesk(CreditInformations shop){
        this.shop = shop;
    }

    private int countOfPayments = 0;

    public String processPayments(CreditInformations creditInformations) {
        String creditCardNumber = creditInformations.getCreditCardNumber();
        countOfPayments++;

        System.out.printf("Der Kunde hat mit der Kreditkartennummer: %s bezahlt \n", creditCardNumber);
        return "payment#" + countOfPayments + "$" + shop.getCreditCardNumber().substring(0, 2);
    }


}
