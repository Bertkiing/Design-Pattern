package simple_factory;

/**
 * Created by king on 2018/3/14.
 */
public enum BrandEnum {
    AUDI("audi"),BENZ("benz"),FORD("ford"),LANDROVER("land rover"),PORSCHE("porsche");


    private String brand;

    BrandEnum(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "BrandEnum{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
