package abstract_factory;

/**
 *
 * @author king
 * @date 2018/3/15
 */
public abstract class Car {
    /**
     * 汽车的三大件：
     * 发动机：Engine
     * 变速箱：Gearbox
     * 地盘：chassis
     */

    Engine engine;
    Gearbox gearbox;
    Chassis chassis;

    public Car(Engine engine, Gearbox gearbox, Chassis chassis) {
        this.engine = engine;
        this.gearbox = gearbox;
        this.chassis = chassis;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Gearbox getGearbox() {
        return gearbox;
    }

    public void setGearbox(Gearbox gearbox) {
        this.gearbox = gearbox;
    }

    public Chassis getChassis() {
        return chassis;
    }

    public void setChassis(Chassis chassis) {
        this.chassis = chassis;
    }

    // 汽车性能
    public void autoPerformance(){

    }

    public abstract void drive();
    public abstract void run();
    public abstract void sound();
    public abstract void carry();

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", gearbox=" + gearbox +
                ", chassis=" + chassis +
                '}';
    }
}
