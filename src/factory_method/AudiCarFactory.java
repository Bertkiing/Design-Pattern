package factory_method;

import simple_factory.AudiCar;
import simple_factory.Car;

/**
 * Created by king on 2018/3/15.
 */
public class AudiCarFactory implements CarFactory {

    @Override
    public Car createCar(CarType carType) {
        Car car = null;
        switch (carType) {
            case SUV:
                car = new AudiCar(CarType.SUV);
                break;
            case MPV:
                car = new AudiCar(CarType.MPV);
                break;
            case COUPE:
                car = new AudiCar(CarType.COUPE);
                break;
            case SEDAN:
                car = new AudiCar(CarType.SEDAN);
                break;
            case ROADSTER:
                car = new AudiCar(CarType.ROADSTER);
                break;
            default:
                car = new AudiCar(CarType.ROADSTER);
        }
        return car;
    }
}
