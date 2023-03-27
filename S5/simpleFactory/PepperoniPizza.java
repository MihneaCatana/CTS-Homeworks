package simpleFactory;

public class PepperoniPizza implements Pizza{

    @Override
    public void taste() {
        System.out.println("This Pepperoni Pizza is amazing!");
    }
}
