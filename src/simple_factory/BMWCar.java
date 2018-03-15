package simple_factory;

/**
 *
 * @author king
 * @date 2018/3/14
 * 宝马汽车
 */
public class BMWCar extends Car {

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
        System.out.println(getBrand() + " is driving");
    }

    @Override
    public void run() {
        System.out.println(getBrand() + "is running");
    }

    @Override
    public void sound() {
        System.out.println(getBrand() + " make sound");
    }

    @Override
    public void carry() {
        System.out.println(getBrand() + " carry man");
    }

    @Override
    public String toString() {
        return "BMWCar{" +
                "brand='" + brand + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", color=" + color +
                '}';
    }
}
