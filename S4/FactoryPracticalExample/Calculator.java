package FactoryPracticalExample;

public class Calculator implements Computer{

    private String nameOfDevice;

    public Calculator(String nameOfDevice){
        this.nameOfDevice = nameOfDevice;
    }

    @Override
    public void typeOfDevice(String typeDevice) {
        System.out.println("This device is a " + typeDevice);
    }
}
