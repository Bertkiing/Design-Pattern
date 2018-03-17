package abstract_factory;

/**
 *
 * @author king
 * @date 2018/3/15
 */
public class AudiIngredientFactory implements CarIngredientFactory {
    @Override
    public Engine createEngine() {
        return new AudiEngine();
    }

    @Override
    public Chassis createChassis() {
        return new AudiChassis();
    }

    @Override
    public Gearbox createGearbox() {
        return new AudiGearbox();
    }


}
