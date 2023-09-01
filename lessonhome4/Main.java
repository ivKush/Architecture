package lessonhome4;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();        
        customer.setCustomerList(new Customer(new User( 1, "Ivanov")));
        customer.setCustomerList(new Customer(new User(2,  "Petrov")));
        customer.setCustomerList(new Customer(new User(3,  "Sidorov")));
        customer.printCustomerList();
        customer.addCardUser(1, 11111, 1000);
        customer.addCardUser(2, 22222, 5000);
        customer.printCustomerList();
        
        customer.buyTicket(2, 2, new Ticket(124343434, 20, 10, true));
        customer.printCustomerList();
        // Застрял на покупке билета, не получается воспользоваться списком покупателей (в него сохранял покупателей при создании),
        // выдаёт пустой список.
        // Прообовал много разных вариантов, что сам запутался, что рабочее, а что нет.
        // Поэтому комментарии оставлять уже безполезно, наступил тот момент, когда легче сделать заново.
    }
}
