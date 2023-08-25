package lessonhome4;

public class Card {

    private int idCustomer;
    private int numberCard;
    private double balanceCard;

    public Card(int idCustomer, int numberCard, double balanceCard) {
        this.idCustomer = idCustomer;
        this.numberCard = numberCard;
        this.balanceCard = balanceCard;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public int getNumberCard() {
        return numberCard;
    }

    public double getBalanceCard() {
        return balanceCard;
    }

    public void setBalanceCard(double balanceCard) {
        this.balanceCard = balanceCard;
    }

    @Override
    public String toString() {
        return "Card [idCustomer=" + idCustomer + ", numberCard=" + numberCard + ", balanceCard=" + balanceCard + "]";
    }

    
}
