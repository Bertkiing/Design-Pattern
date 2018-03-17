package abstract_factory;

/**
 * @author king
 * @date 2018/3/15
 */
public class BMWIngredientFactory implements CarIngredientFactory {
    @Override
    public Engine createEngine() {
        return new BMWEngine();
    }

    @Override
    public Chassis createChassis() {
        return new BMWChassis();
    }

    @Override
    public Gearbox createGearbox() {
        return new BenzGearbox();
    }


}
