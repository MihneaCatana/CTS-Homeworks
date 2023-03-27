package SingletonEnunt;

/*
*
*   O fabrica de masini care implementeaza un sistem centralizat de monitorizare a productiei.
*   Sistemul trebuie sa asigure adaugarea si modificarea datelor despre masinile fabricate la nivelul
*   sediului central, intr-un mediu securizat (sistemul va exista sub forma unui server dispus in datacenter-ul
*   din HQ). Programatorii trebuie sa se asigure ca sistemul nu va putea fi replicat si ca toate datele vor fi
*   manageriate prin intermediul singurului server mentionat anterior.
*
* */

public class CentralServer {

    private static CentralServer server;
    private String nameOfServer;

    private CentralServer(String nameOfServer){
        this.nameOfServer = nameOfServer;
    }

    public static synchronized CentralServer getInstance(String nameOfServer){
        if(server == null) {
            server = new CentralServer(nameOfServer);
        }
        return server;
    }

}
