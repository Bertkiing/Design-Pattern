package simple_factory;

/**
 * Created by king on 2018/3/15.
 */
public class Government {
    // 1. 我需要一个汽车工厂
    private SingleCarFactory mFactory;

    public Government(SingleCarFactory mFactory) {
        this.mFactory = mFactory;
    }


    public Car useCar(BrandSpeedEnum brand){
        System.out.println("政府用车...");
        Car car;
        car = mFactory.createCar(brand);

        car.drive();
        car.run();
        car.sound();
        car.carry();

        car.toString();

        return car;
    }
}
