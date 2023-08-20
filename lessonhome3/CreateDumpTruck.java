package lessonhome3;

public class CreateDumpTruck extends CreateTruck implements SkillDumpTruck {

    String board;

    public CreateDumpTruck(TypeEngine typeEngine, int wheels, double cargoVolume, EngeneSize engeneSize, String board) {
        super(typeEngine, wheels, cargoVolume, engeneSize);
        this.board = board;
    }

    @Override
    public void category() {
        super.category();
    }

    @Override
    public void raiseBoard() {
        System.out.println("Raise board"); // Поднимать борт/высыпать
    }
}
