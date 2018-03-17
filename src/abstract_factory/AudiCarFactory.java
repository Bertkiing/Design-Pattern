package abstract_factory;

import simple_factory.BrandSpeedEnum;

/**
 *
 * @author king
 * @date 2018/3/16
 */
public class AudiCarFactory implements CarFactory {
    AudiIngredientFactory audiIngredientFactory;

    public AudiCarFactory() {
    }

    @Override
    public Car createCar() {
        audiIngredientFactory = new AudiIngredientFactory();
        Car car = new AudiCar(
                audiIngredientFactory.createEngine(),
                audiIngredientFactory.createGearbox(),
                audiIngredientFactory.createChassis());
        return car;
    }
}
