package factory_method;

import simple_factory.BrandSpeedEnum;

import java.net.URLStreamHandlerFactory;
import java.nio.charset.Charset;
import java.text.NumberFormat;
import java.util.EnumSet;

/**
 * Created by king on 2018/3/15.
 */
public class CarBuyer {
    public static void main(String[] args) {
        CarShop carShop = new BeijingCarShop();
        carShop.sellCar(BrandSpeedEnum.BENZ,CarType.ROADSTER);

//        NumberFormat
//        Charset
//        URLStreamHandlerFactory
//        EnumSet
    }
}
