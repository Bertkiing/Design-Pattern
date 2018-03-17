package abstract_factory;

/**
 *
 * @author king
 * @date 2018/3/15
 */
public class BenzIngredientFactory implements CarIngredientFactory {
    @Override
    public Engine createEngine() {
        return new BenzEngine();
    }

    @Override
    public Chassis createChassis() {
        return new BenzChassis();
    }

    @Override
    public Gearbox createGearbox() {
        return new BenzGearbox();
    }


}
