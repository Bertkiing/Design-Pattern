package simple_factory;

/**
 *
 * @author king
 * @date 2018/3/14
 * 奔驰
 */
public class BenzCar extends Car {

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
        System.out.println(getBrand()+" is driving");
    }

    @Override
    public void run() {
        System.out.println(getBrand()+ " is running");
    }

    @Override
    public void sound() {
        System.out.println(getBrand() + " make sound");
    }

    @Override
    public void carry() {
        System.out.println(getBrand() + " carry man");
    }
}
