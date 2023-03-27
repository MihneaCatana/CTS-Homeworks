package Factory;

public class MetalProduct implements AbstractProduct{

    @Override
    public void description() {
        System.out.println("This is a metal product");
    }
}
