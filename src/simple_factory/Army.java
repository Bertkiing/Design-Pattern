package simple_factory;

/**
 *
 * @author king
 * @date 2018/3/15
 * 军队
 */
public class Army {
    public Car useCar(BrandSpeedEnum brand){
        System.out.println("军队用车...");
        Car car;
        car = SingleCarFactory.createCars(brand);

        car.drive();
        car.run();
        car.sound();
        car.carry();

        car.toString();

        return car;
    }
}
