package i__Creational.c__abstract_factory;

public class AppleFactory implements IMobileFactory {
    public Phone createPhone() {
        return new Iphone();
    }

    public Tablet createTablet() {
        return new Ipad();
    }
}