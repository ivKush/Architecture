package lessonhome4;

import java.util.ArrayList;
import java.util.List;

public class Customer extends TicketProvider {

    private int id;
    private User user;

    private List<Customer> customerList = new ArrayList<>();
    private List<Ticket> ticketsListCustomer = new ArrayList<>();
    private CashProvider cashProvaider;

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

    // public List getTickets() {
    //     return tickets;
    // }

    // public void setTickets(List tickets) {
    //     this.tickets.addAll(tickets);
    // }

    public boolean buyTicket(int idCustomer, int countTicket) {
        try {
            user.setUserTickets(sellTicketsProvider(idCustomer, countTicket));
            return true;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    public void addCardUser(int idUser, int numberCard, double balanceCard) {
        cashProvaider = new CashProvider();
        for (Customer customer : customerList) {
            if (customer.getId() == idUser) {
                customer.user.setCard(cashProvaider.openCardCustomer(idUser, numberCard, balanceCard));
            }
        }
    }

    public double cardBalance(int id) {
        cashProvaider = new CashProvider();
        return cashProvaider.balanceCardCustomer(id);
    }

    public Ticket searchTicket(long rootNumber) {

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
