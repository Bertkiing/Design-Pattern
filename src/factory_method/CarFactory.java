package factory_method;

import simple_factory.Car;

/**
 *
 * @author king
 * @date 2018/3/15
 * 汽车工厂抽象类
 */
public interface CarFactory {
    /**
     * 根据汽车类型生产对应的汽车
     * @param carType 汽车类型
     * @return
     */
    Car createCar(CarType carType);
}
