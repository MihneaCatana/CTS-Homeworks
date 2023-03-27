package simpleFactory;

public class Main {

    public static void main(String[] args) {

            Pizza pepPizza = PizzaFactory.createPizza(PizzaTypes.PEPPERONI);
            pepPizza.taste();

            Pizza chPizza = PizzaFactory.createPizza(PizzaTypes.CHEESE);
            chPizza.taste();

            Pizza marPizza = PizzaFactory.createPizza(PizzaTypes.MARGHERITA);
            marPizza.taste();
    }
}
