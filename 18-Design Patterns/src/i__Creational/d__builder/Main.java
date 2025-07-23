package i__Creational.d__builder;

public class Main {
    public static void main(String[] args) {
        Burger myBurger = new BurgerBuilder()
                              .setBun("Sesame Bun")
                              .setPatty("Chicken")
                              .setCheese("Cheddar")
                              // .setSauce("Spicy Mayo") // Optional
                              .build();

        System.out.println(myBurger);
    }
}
