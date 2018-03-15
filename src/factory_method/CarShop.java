package factory_method;

import simple_factory.BrandSpeedEnum;
import simple_factory.Car;

/**
 *
 * @author king
 * @date 2018/3/15
 */
public interface CarShop {
    Car sellCar(BrandSpeedEnum brand, CarType carType);
}
