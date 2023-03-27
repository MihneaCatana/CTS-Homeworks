package Factory;

public class GlassProduct implements AbstractProduct{

    @Override
    public void description() {
        System.out.println("This is a glass product");
    }
}
