package lessonhome4;

import java.util.ArrayList;
import java.util.List;

public class Customer extends TicketProvider {

    private int id;
    private User user;

    private List<Customer> customerList = new ArrayList<>();
    private List<Ticket> ticketsListCustomer = new ArrayList<>();
    private CashProvider cashProvaider = new CashProvider();

    public Customer () {};

    public Customer(User user) {
        this.id = user.getUserId();
        this.user = user;
    }

    public void setCustomerList (Customer customer) {
    this.customerList.add(customer);
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public User getUserCustomer() {
        return user;
    }

    public int getId() {
        return id;
    }

    public boolean buyTicket(int idCustomer, int countTicket, Ticket ticket) {
        try {
            user.setUserTickets(sellTicketsProvider(idCustomer, countTicket, ticket));
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public void addCardUser(int idUser, int numberCard, double balanceCard) {
        
        for (Customer customer : customerList) {
            if (customer.getId() == idUser) {
                // cashProvaider.openCardCustomer(idUser, numberCard, balanceCard);
                customer.user.setCard(cashProvaider.openCardCustomer(idUser, numberCard, balanceCard));
            }
        }
    }

    public double cardBalance(int idUser) {
        // cashProvaider = new CashProvider();
        try {
            return cashProvaider.balanceCardCustomer(idUser);
            
        } catch (RuntimeException e) {
            System.out.println(e.getMessage()); 
            return (Double) null;
        }
    }

    public Ticket searchTicket(long rootNumber) throws RuntimeException {

        for (Ticket ticket : user.getUserTickets()) {
            if (ticket.getRootNumber() == rootNumber) {
                return ticket;
            }
        }
        throw new RuntimeException("Нет билетов с такими данными");
    }

    @Override
    public String toString() {
        return "Customer [id=" + id + ", user=" + user + "]";
    }

    public void printCustomerList() {
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

}
