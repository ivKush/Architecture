package lessonhome3;

public class CreateBus extends Car implements SkillBus {

    private int personPlace; // Количество посадочных мест
    private EngeneSize engeneSize;

    public CreateBus(TypeEngine typeEngine, int wheels, int personPlace, EngeneSize engeneSize) {
        super(typeEngine, wheels);
        this.personPlace = personPlace;
        this.engeneSize = engeneSize;
    }

    @Override
    public void category() {
        System.out.println("category Bus");
    }

    @Override
    public void openDoors() {
        System.out.println("open doors for passengers");
    }

    @Override
    public void tickets() {
        System.out.println("sell tickets");
    }

}
