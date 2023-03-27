package simpleFactory;

public class PizzaFactory {

    public static Pizza createPizza(PizzaTypes type){

        if(type == PizzaTypes.CHEESE)
            return new CheesePizza();
        if(type == PizzaTypes.PEPPERONI)
            return new PepperoniPizza();
        if(type == PizzaTypes.MARGHERITA)
            return new MargheritaPizza();
        return null;
    }
}
