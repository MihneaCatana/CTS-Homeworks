package factoryMethod;

public class Cow implements Animal{
    @Override
    public void makeNoise() {
        System.out.println("MOOOOO!");
    }
}
