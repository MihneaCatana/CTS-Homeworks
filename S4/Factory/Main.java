package Factory;

public class Main {

    public static void main(String[] args) {

        AbstractProduct glassProduct = Factory.createInstance("Glass");
        AbstractProduct metalProduct = Factory.createInstance("Metal");
        AbstractProduct plasticProduct = Factory.createInstance("Plastic");

        glassProduct.description();
        metalProduct.description();
        plasticProduct.description();
    }
}
