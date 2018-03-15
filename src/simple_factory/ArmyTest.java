package simple_factory;

/**
 * Created by king on 2018/3/15.
 */
public class ArmyTest {

    public static void main(String[] args) {
        Army army = new Army();
        army.useCar(BrandSpeedEnum.BMW);
    }
}
