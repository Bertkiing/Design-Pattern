package abstract_factory;

import simple_factory.BrandSpeedEnum;

/**
 * Created by king on 2018/3/15.
 */
public class AudiGearbox implements Gearbox {
    @Override
    public BrandSpeedEnum getBrand() {
        return BrandSpeedEnum.AUDI;
    }
}
