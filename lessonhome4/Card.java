package lessonhome4;

public class Card {

    private int idUser;
    private int numberCard;
    private double balanceCard;

    public Card(int idUser, int numberCard, double balanceCard) {
        this.idUser = idUser;
        this.numberCard = numberCard;
        this.balanceCard = balanceCard;
    }

    public int getIdUser() {
        return idUser;
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
        return "Card [idUser=" + idUser + ", numberCard=" + numberCard + ", balanceCard=" + balanceCard + "]";
    }

    
}
