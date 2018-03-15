package simple_factory;

/**
 * Created by king on 2018/3/14.
 * 简单工厂的测试类
 */
public class SingleFactoryTest {
    public static void main(String[] args) {
        SingleCarFactory factory = new SingleCarFactory();
        SingleCarShop shop = new SingleCarShop(factory);
        shop.sellCar(BrandSpeedEnum.AUDI);
        System.out.println("------------------");
       shop.sellCar(BrandSpeedEnum.BENZ);
        System.out.println("------------------");
        shop.sellCar(BrandSpeedEnum.BMW);
    }
}
