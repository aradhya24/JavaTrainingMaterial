package i__Creational.d__builder;

public class BurgerBuilder {
    private String bun = "default bun";
    private String patty = "default patty";
    private String cheese = "no cheese";
    private String sauce = "no sauce";

    public BurgerBuilder setBun(String bun) {
        this.bun = bun;
        return this;
    }

    public BurgerBuilder setPatty(String patty) {
        this.patty = patty;
        return this;
    }

    public BurgerBuilder setCheese(String cheese) {
        this.cheese = cheese;
        return this;
    }

    public BurgerBuilder setSauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    public Burger build() {
        return new Burger(bun, patty, cheese, sauce);
    }
}
