package simple_factory;

import factory_method.CarType;

/**
 *
 * @author king
 * @date 2018/3/14
 * 宝马汽车
 */
public class BMWCar extends Car {
    public BMWCar() {
    }

    public BMWCar(CarType carType) {
        this.carType = carType;
    }

    @Override
    public String getBrand() {
        return BrandSpeedEnum.BMW.getBrand();
    }



    @Override
    public int getMaxSpeed() {
        return BrandSpeedEnum.BMW.getMaxSpeed();
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
        System.out.println(brandAndCartype() + "is running");
    }

    @Override
    public void sound() {
        System.out.println(brandAndCartype() + " make sound");
    }

    @Override
    public void carry() {
        System.out.println(brandAndCartype() + " carry man");
    }

    @Override
    public String toString() {
        return "BMWCar{" +
                "brand='" + brand + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", color=" + color +
                ", carType=" + carType +
                '}';
    }
}
