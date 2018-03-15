package factory_method;

/**
 *
 * @author king
 * @date 2018/3/15
 *
 * roadster:跑车
 * coupe:运动感很强的轿车
 * sedan:轿车
 */
public enum CarType {
    SUV("suv"),MPV("mpv"),ROADSTER("roadster"),COUPE("coupe"),SEDAN("sedan");

    private String type;

    CarType(String type) {
        this.type = type;
    }
}
