package lessonhome2;

public class SilverGenerator extends ItemFabric  {

    @Override
    public iGameItem createItem() {
        System.out.println("Создал новый сундук");
        return new SilverReward();
    }
    
}
