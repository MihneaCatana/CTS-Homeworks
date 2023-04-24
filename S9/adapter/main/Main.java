package adapter.main;

import adapter.classes.AdaptorIntrare;
import adapter.classes.Cablu;
import adapter.classes.Receptor;

public class Main {


//    In DP Adapter, adapterul are o relatie de "is a" din urma derivarii interfetei
//    si una "has a" in cazul adaptorului de obiecte
    public static void main(String[] args) {

        Cablu cablu = new Cablu("HDMI",3);
        Receptor receptor = new Receptor("VGA",4);

        cablu.transmiteSemnal();
        receptor.primesteSemnal();

        AdaptorIntrare adaptor = new AdaptorIntrare(cablu);
        adaptor.primesteSemnal();

    }
}
