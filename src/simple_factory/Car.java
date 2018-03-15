package simple_factory;

import factory_method.CarType;

/**
 * Created by king on 2018/3/14.
 */
public abstract class Car {
    public String brand = "bmw";
    public int maxSpeed = 0;
    public CarColorEnum color ;
    public CarType carType;

    public abstract void drive();
    public abstract void run();
    public abstract void sound();
    public abstract void carry();

    public CarType getCarType() {
        return carType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public CarColorEnum getColor() {
        return color;
    }

    public void setColor(CarColorEnum color) {
        this.color = color;
    }

    public String  brandAndCartype(){
        return  getBrand()+" : "+ getCarType();
    }
}
