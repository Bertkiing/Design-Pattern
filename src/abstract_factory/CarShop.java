package abstract_factory;

import simple_factory.BrandSpeedEnum;

/**
 *
 * @author king
 * @date 2018/3/15
 */
public class CarShop {
    CarFactory factory;

    public Car sellCar(BrandSpeedEnum brand) {
        Car car;
        switch (brand) {
            case BENZ:
                car = new BenzCarFactory().createCar();
                break;
            case BMW:
                car = new BMWCarFactory().createCar();
                break;
            case AUDI:
                car = new AudiCarFactory().createCar();
                break;
            default:
                throw new IllegalArgumentException("cannot support argument");
        }


        System.out.println("汽车销售商卖车...");

        car.drive();
        car.run();
        car.sound();
        car.carry();

        car.toString();

        return car;
    }
}
