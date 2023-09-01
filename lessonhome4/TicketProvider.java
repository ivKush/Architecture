package lessonhome4;

import java.util.ArrayList;
import java.util.List;

public class TicketProvider extends CashProvider {

    public Ticket ticket;
    public List<Ticket> ticketList;

    public List<Ticket> sellTicketsProvider(int customerId, int countTikets, Ticket ticket) throws Exception {
        List<Ticket> ticketList = new ArrayList<>();
        Customer cust = new Customer();
        if (cust.cardBalance(customerId) >= (ticket.getPrice() * countTikets)) {
            transactionMinus(ticket.getPrice() * countTikets);
            while (countTikets != 0) {
                ticket = new Ticket();
                ticketList.add(ticket);
                countTikets--;
            }
            return ticketList;
        } else
            throw new Exception("Недостаточно средств");
    }

    public boolean updateTicketStatus(Ticket ticket) {
        return false;
    }

}
