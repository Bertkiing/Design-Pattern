package abstract_factory;

import simple_factory.BrandSpeedEnum;

/**
 * Created by king on 2018/3/15.
 */
public class AudiChassis implements Chassis {
    @Override
    public BrandSpeedEnum getBrand() {
        return BrandSpeedEnum.AUDI;
    }
}
