package lessonhome4;

import java.util.ArrayList;
import java.util.List;

public class TicketProvider extends CashProvider {

    public Ticket ticket;
    // public List<Ticket> ticketList;

    public List<Ticket> sellTicketsProvider(int customerId, int countTikets, Ticket ticket) throws Exception {
        // ticket = new Ticket();
        List<Ticket> ticketList = new ArrayList<>();
        if (balanceCardCustomer(customerId) >= (ticket.getPrice() * countTikets)) {
            transactionMinus(ticket.getPrice() * countTikets);
            while (countTikets != 0) {
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
