package simple_factory;

import factory_method.CarType;

/**
 * @author king
 * @date 2018/3/14
 * 奔驰
 */
public class BenzCar extends Car {

    public BenzCar() {
    }

    public BenzCar(CarType type) {
        this.carType = type;
    }

    @Override
    public String getBrand() {
        return BrandSpeedEnum.BENZ.getBrand();
    }

    @Override
    public int getMaxSpeed() {
        return BrandSpeedEnum.BENZ.getMaxSpeed();
    }

    @Override
    public CarColorEnum getColor() {
        return CarColorEnum.BLACK;
    }

    @Override
    public void drive() {
        System.out.println(brandAndCartype() + " is driving");
    }

    @Override
    public void run() {
        System.out.println(brandAndCartype() + " is running");
    }

    @Override
    public void sound() {
        System.out.println(brandAndCartype() + " make sound");
    }

    @Override
    public void carry() {
        System.out.println(brandAndCartype() + " carry man");
    }
}
