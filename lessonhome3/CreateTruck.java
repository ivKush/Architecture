package lessonhome3;

public class CreateTruck extends Car implements Truck {

    private double cargoVolume; // объём/вместительность кузова
    private EngeneSize engeneSize;

    public CreateTruck(TypeEngine typeEngine, int wheels, double cargoVolume, EngeneSize engeneSize) {
        super(typeEngine, wheels);
        this.cargoVolume = cargoVolume;
        this.engeneSize = engeneSize;
    }

    @Override
    public void category() {
        System.out.println("Category Truck");
    }

    @Override
    public void volumeTraffic() {
        System.out.println("transportation 30 tons");
    }

}
