package simple_factory;


/**
 * Created by king on 2018/3/14.
 * 简单的汽车工厂
 */
public class SingleCarFactory {
    public  Car createCar(BrandSpeedEnum brand) {
      return createCars(brand);
    }

    /**
     * @param brand 品牌
     * @return
     *
     * 静态方法
     */
    public static Car createCars(BrandSpeedEnum brand) {

        Car car = null;
        switch (brand) {
            case AUDI:
                // 只有这里需要用到具体的产品
                car = new AudiCar();
                break;
            case BENZ:
                car = new BenzCar();
                break;
            case BMW:
                car = new BMWCar();
            default:
                break;
        }
        return car;
    }

}
