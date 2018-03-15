package simple_factory;

/**
 * Created by king on 2018/3/14.
 */
public enum BrandSpeedEnum {
    AUDI("audi",200),
    BENZ("benz",210),
    BMW("bmw",250),
    FORD("ford",180),
    LANDROVER("land rover",190),
    PORSCHE("porsche",230);


    private  final String brand;
    private int maxSpeed;

    BrandSpeedEnum(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "BrandSpeedEnum{" +
                "brand='" + brand + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
