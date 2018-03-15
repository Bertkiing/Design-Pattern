package simple_factory;

/**
 *
 * @author king
 * @date 2018/3/14
 * 汽车销售商
 */
public class SingleCarShop {
   SingleCarFactory factory;

    public SingleCarShop(SingleCarFactory factory) {
        this.factory = factory;
    }

    public Car sellCar(BrandSpeedEnum brand){
        Car car;
        // 不需要new 具体的对象，良好的编程习惯
        car = factory.createCar(brand);
        System.out.println("汽车销售商卖车...");

        car.drive();
        car.run();
        car.sound();
        car.carry();

        car.toString();

        return car;
    }
}
