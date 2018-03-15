package simple_factory;

/**
 *
 * @author king
 * @date 2018/3/15
 *
 * 政府用车测试类
 */
public class GovernmentTest {
    public static void main(String[] args) {
        SingleCarFactory factory = new SingleCarFactory();
        Government government = new Government(factory);
        government.useCar(BrandSpeedEnum.AUDI);
    }

}
