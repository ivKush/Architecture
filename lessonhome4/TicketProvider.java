package lessonhome4;

import java.util.ArrayList;
import java.util.List;

public class TicketProvider extends CashProvider {

    public Ticket ticket;
    // public List<Ticket> ticketList;

    public List<Ticket> sellTicketsProvider(int customerId, int count) throws Exception {
        // ticket = new Ticket();
        List<Ticket> ticketList = new ArrayList<>();
        if (balanceCardCustomer(customerId) >= (ticket.getPrice() * count)) {
            transactionMinus(ticket.getPrice() * count);
            while (count != 0) {
                ticket.setValid(true);
                // ticket = new Ticket(ticket.getRootNumber(), ticket.getPrice(), ticket.getPlace(), ticket.getDate(),
                ticket = new Ticket(124343434, 20, 10, true);
                ticketList.add(ticket);
                count--;
            }
            return ticketList;
        } else
            throw new Exception("Недостаточно средств");
    }

    public boolean updateTicketStatus(Ticket ticket) {
        return false;
    }

}
