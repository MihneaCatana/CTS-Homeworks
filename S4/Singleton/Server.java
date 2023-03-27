package Singleton;

public class Server {

    private int portNr;
    private String name;
    private static Server instance;

    private Server(int portNr, String name) {
        this.portNr = portNr;
        this.name = name;
    }

    public static synchronized Server    getInstance(int portNr, String name) {
        if(instance == null) {
            instance = new Server(portNr,name);
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Singleton.Server{" +
                "portNr=" + portNr +
                ", name='" + name + '\'' +
                '}';
    }
}
