package facade;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Material> materials = new ArrayList<>();
        materials.add(new Material(50,4,"Ciment"));
        materials.add(new Material(43,9,"Vopsea"));
        List<Permit> permits = new ArrayList<>();
        permits.add(new Permit(new Date(),"Urbanism",10));
        permits.add(new Permit(new Date(),"Constructii",50));
        Facade facade = new Facade("Otopeni", permits,materials);

        facade.printContructionDetails();
    }


}
