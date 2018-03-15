package abstract_factory;

/**
 * Created by king on 2018/3/15.
 */
public class AudiCar extends Car {


    public AudiCar(Engine engine, Gearbox gearbox, Chassis chassis) {
        super(engine, gearbox, chassis);
    }

    @Override
    public void autoPerformance() {


    }

    @Override
    public void drive() {

    }

    @Override
    public void run() {

    }

    @Override
    public void sound() {

    }

    @Override
    public void carry() {

    }
}
