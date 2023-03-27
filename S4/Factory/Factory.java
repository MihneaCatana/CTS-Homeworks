package Factory;

public class Factory {

    public static AbstractProduct createInstance(String typeProduct){

        switch (typeProduct){
            case "Metal": return new MetalProduct();
            case "Glass": return new GlassProduct();
            case "Plastic": return new PlasticProduct();
            default: return null;
        }

    }
}
