package lessonhome3;

public abstract class Car {

    private TypeEngine typeEngine;
    private int wheels;

    public Car(TypeEngine typeEngine, int wheels) {
        this.typeEngine = typeEngine;
        this.wheels = wheels;
    }

    public void category() {};
}
