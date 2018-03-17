package abstract_factory;

/**
 *
 * @author king
 * @date 2018/3/16
 */
public class BMWCarFactory implements CarFactory {
    BMWIngredientFactory ingredientFactory;

    public BMWCarFactory() {
    }

    @Override
    public Car createCar() {

        ingredientFactory = new BMWIngredientFactory();

        return new BMWCar(ingredientFactory.createEngine(),
                ingredientFactory.createGearbox(),
                ingredientFactory.createChassis()) ;
    }
}
