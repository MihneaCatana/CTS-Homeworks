package Factory;

public class PlasticProduct implements AbstractProduct{

    @Override
    public void description() {
        System.out.println("This is a plastic product");
    }
}
