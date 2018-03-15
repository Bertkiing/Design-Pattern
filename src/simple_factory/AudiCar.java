package simple_factory;

import factory_method.CarType;

/**
 *
 * @author king
 * @date 2018/3/14
 * 奥迪汽车
 */
public class AudiCar extends Car{
    public AudiCar(CarType carType) {
        this.carType = carType;
    }

    public AudiCar() {
    }

    @Override
    public String getBrand() {
        return BrandSpeedEnum.AUDI.getBrand();
    }

    @Override
    public void setBrand(String brand) {
       this.brand = brand;
    }

    @Override
    public int getMaxSpeed() {
        return BrandSpeedEnum.AUDI.getMaxSpeed();
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public CarColorEnum getColor() {
        return CarColorEnum.BLACK;
    }

    @Override
    public void setColor(CarColorEnum color) {
        this.color = color;
    }

    @Override
    public void drive() {
        System.out.println( brandAndCartype()+" is driving");
    }

    @Override
    public void run() {
        System.out.println(brandAndCartype()+" is  running");
    }

    @Override
    public void sound() {
        System.out.println(brandAndCartype()+" make sound");
    }

    @Override
    public void carry() {
        System.out.println(brandAndCartype()+ " carry man");
    }


    @Override
    public String toString() {
        return "AudiCar{" +
                "brand='" + brand + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", color=" + color +
                ", carType=" + carType +
                '}';
    }
}
