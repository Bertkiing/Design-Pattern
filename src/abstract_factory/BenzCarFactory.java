package abstract_factory;

import simple_factory.BrandSpeedEnum;

/**
 *
 * @author king
 * @date 2018/3/16
 */
public class BenzCarFactory implements CarFactory {
  BenzIngredientFactory ingredientFactory;

    public BenzCarFactory() {
    }

    @Override
    public Car createCar() {
        ingredientFactory = new BenzIngredientFactory();
        return new BenzCar(ingredientFactory.createEngine(),
                ingredientFactory.createGearbox(),
                ingredientFactory.createChassis());
    }
}
