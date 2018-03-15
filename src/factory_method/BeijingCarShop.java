package factory_method;

import simple_factory.BrandSpeedEnum;
import simple_factory.Car;

/**
 * @author king
 * @date 2018/3/15
 */
public class BeijingCarShop implements CarShop {


    @Override
    public Car sellCar(BrandSpeedEnum brand, CarType carType) {
        CarFactory carFactory = null;
        switch (brand) {
            case BMW:
                carFactory = new BMWCarFactory();
                break;
            case AUDI:
                carFactory = new AudiCarFactory();
                break;
            case BENZ:
                carFactory = new BenzCarFactory();
                break;
            default:
                carFactory = new BMWCarFactory();
        }


        Car car;
        System.out.println("北京汽车销售商卖车...");
        car = carFactory.createCar(carType);
        car.drive();
        car.run();
        car.sound();
        car.carry();

        car.toString();
        return null;
    }
}
