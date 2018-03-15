package factory_method;

import simple_factory.*;
import simple_factory.Car;

/**
 *
 * @author king
 * @date 2018/3/15
 * 奔驰汽车制造厂
 */
public class BenzCarFactory implements CarFactory{
    @Override
    public Car createCar(CarType carType) {
        Car car = null;
        switch (carType) {
            case SUV:
                car = new BenzCar(CarType.SUV);
                break;
            case MPV:
                car = new BenzCar(CarType.MPV);
                break;
            case COUPE:
                car = new BenzCar(CarType.COUPE);
                break;
            case SEDAN:
                car = new BenzCar(CarType.SEDAN);
                break;
            case ROADSTER:
                car = new BenzCar(CarType.ROADSTER);
                break;
            default:
                car = new BenzCar(CarType.ROADSTER);
        }
        return car;
    }
}
