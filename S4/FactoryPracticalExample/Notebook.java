package FactoryPracticalExample;

public class Notebook implements Computer{

    private String nameOfDevice;

    public Notebook(String nameOfDevice){
        this.nameOfDevice = nameOfDevice;
    }

    @Override
    public void typeOfDevice(String typeDevice) {
        System.out.println("This device is a " + typeDevice);
    }
}
