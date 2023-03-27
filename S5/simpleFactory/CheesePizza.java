package simpleFactory;

public class CheesePizza implements Pizza{

    @Override
    public void taste() {
        System.out.println("This Cheese Pizza is good!");
    }
}
