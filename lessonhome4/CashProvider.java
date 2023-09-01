package lessonhome4;

import java.util.ArrayList;
import java.util.List;

public class CashProvider {

    private Card card;
    private List<Card> listCardCustomer = new ArrayList<>();

    public Card openCardCustomer(int idUser, int cardNumber, double balance) {
        card = new Card(idUser, cardNumber, balance);
        listCardCustomer.add(card);
        return card;
    }

    // public double balanceCardCustomer(int customerId) throws RuntimeException {
    //     Customer cust = new Customer();
    //     for (Customer customer  : cust.getCustomerList()) {
    //         if (customer.getId() == customerId) {
    //             return customer.getUserCustomer().getCard().getBalanceCard();
    //         }
    //     }
    //     throw new RuntimeException("Нет такого покупателя");
    // }

    public Card searchCardCustomer(int customerId) {

        for (Card card : listCardCustomer) {
            if (card.getIdUser() == customerId) {
                return card;
            }
        }
        return null;
    }
    
    public void transactionMinus(double cash) {
        card.setBalanceCard(card.getBalanceCard() - cash);
    }

}
