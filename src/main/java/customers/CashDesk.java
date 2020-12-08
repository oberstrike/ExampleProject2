package customers;

public class CashDesk {

    private int countOfPayments = 0;

    public String processPayments(CreditInformations creditInformations) {
        String creditCardNumber = creditInformations.getCreditCardNumber();
        countOfPayments++;

        System.out.printf("Der Kunde hat mit der Kreditkartennummer: %s bezahlt \n", creditCardNumber);
        return "payment#" + countOfPayments;
    }


}
