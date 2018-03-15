package factory_method;

import simple_factory.BrandSpeedEnum;
import simple_factory.Car;

/**
 * Created by king on 2018/3/15.
 */
public class ShanghaiCarShop implements CarShop {
    @Override
    public Car sellCar(BrandSpeedEnum brand, CarType carType) {
        return null;
    }
}
