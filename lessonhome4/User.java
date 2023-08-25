package lessonhome4;

import java.util.ArrayList;
import java.util.List;

public class User {

    private int id;
    private String userName;
    private Card card;
    private List<Ticket> userTickets = new ArrayList<>();

    public User(int id, String userName) {
        // this.id = getUserId() + 1;
        this.id = id;
        this.userName = userName;
    }

    public int getUserId() {
        return id;
    }

    public void setUserId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public List<Ticket> getUserTickets() {
        return userTickets;
    }

    public void setUserTickets(List<Ticket> userTickets) {
        this.userTickets = userTickets;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", userName=" + userName + ", card=" + card + ", userTickets=" + userTickets + "]";
    }
    
}
