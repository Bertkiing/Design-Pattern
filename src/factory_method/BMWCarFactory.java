package factory_method;

import simple_factory.*;
import simple_factory.Car;

/**
 *
 * @author king
 * @date 2018/3/15
 * 宝马汽车制造厂
 */
public class BMWCarFactory implements CarFactory{
    @Override
    public Car createCar(CarType carType) {
        Car car = null;
        switch (carType) {
            case SUV:
                car = new BMWCar(CarType.SUV);
                break;
            case MPV:
                car = new BMWCar(CarType.MPV);
                break;
            case COUPE:
                car = new BMWCar(CarType.COUPE);
                break;
            case SEDAN:
                car = new BMWCar(CarType.SEDAN);
                break;
            case ROADSTER:
                car = new BMWCar(CarType.ROADSTER);
                break;
            default:
                car = new BMWCar(CarType.ROADSTER);
        }
        return car;
    }
}
