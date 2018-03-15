package abstract_factory;

import simple_factory.BrandSpeedEnum;

/**
 * Created by king on 2018/3/15.
 */
public class CarShop {
    CarIngredientFactory factory;

    public Car sellCar(BrandSpeedEnum brand) {
        Car car;
        // 不需要new 具体的对象，良好的编程习惯

        switch (brand) {
            case BENZ:
                factory = new BenzIngredientFactory();
                break;
            case BMW:
                factory = new BMWIngredientFactory();
                break;
            case AUDI:
                factory = new AudiIngredientFactory();
                break;
            default:
                throw new IllegalArgumentException("cannot support argument");
        }

        car = factory.createCar();
        System.out.println("汽车销售商卖车...");

        car.drive();
        car.run();
        car.sound();
        car.carry();

        car.toString();

        return car;
    }
}
