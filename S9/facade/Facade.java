package facade;

import java.util.List;

public class Facade {

    private String locatie;

    public Facade(String locatie, List<Permit> permits, List<Material> materials) {
        this.locatie = locatie;
        this.permits = permits;
        this.materials = materials;
    }

    List<Permit> permits;

    List<Material> materials;

    void printContructionDetails(){

        System.out.println("Constructia are loc in: "+locatie);

        for (Permit permit : permits) {
            System.out.println(permit.toString());
        }

        for (Material material : materials) {
            System.out.println(material.toString());
        }


    }
}
