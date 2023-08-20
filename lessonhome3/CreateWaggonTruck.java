package lessonhome3;

public class CreateWaggonTruck extends CreateTruck implements SkillWaggonTruck {

    String trailer;

    public CreateWaggonTruck(TypeEngine typeEngine, int wheels, double cargoVolume, EngeneSize engeneSize,
            String trailer) {
        super(typeEngine, wheels, cargoVolume, engeneSize);
        this.trailer = trailer;
    }

    @Override
    public void category() {
        super.category();
    }

    @Override
    public void TransportationBox() {
        System.out.println("transportation of boxes");
    }

}