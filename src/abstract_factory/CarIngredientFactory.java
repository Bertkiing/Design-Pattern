package abstract_factory;

/**
 *
 * @author king
 * @date 2018/3/15
 */
public interface CarIngredientFactory {
    Engine createEngine();
    Chassis createChassis();
    Gearbox createGearbox();

    Car createCar();
}
